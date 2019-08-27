package level02;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Printer {
    public int solution(int[] priorities, int location) throws InterruptedException {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> queue = new ArrayDeque();

        for(int i=0; i<priorities.length; i++){
            map.put(i, priorities[i]);
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            int n = queue.poll();
            int priority = map.get(n);

            boolean isOffer = false;
            Iterator<Integer> iter = queue.iterator();
            while(iter.hasNext()){
                int key = iter.next();
                if(map.get(key) > priority){
                    queue.offer(n);
                    isOffer = true;
                    break;
                }
            }

            if(!isOffer){
                answer++;
                if(n==location){
                    break;
                }
            }
        }

        return answer;
    }
}
