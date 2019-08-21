package level02;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] answer = {};
        LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = 0;
            int progress = progresses[i];
            while (progress < 100) {
                progress += speeds[i];
                day++;
            }
            queue.offer(day);
        }

        ArrayList<Integer> releaseList = new ArrayList<>();

        int refDay = queue.poll();
        int releaseCnt = 1;

        while (!queue.isEmpty()) {
            int pollDay = queue.poll();
            if(refDay < pollDay){
                releaseList.add(releaseCnt);
                refDay = pollDay;
                releaseCnt = 1;
            } else {
                releaseCnt++;
            }
        }
        releaseList.add(releaseCnt);
        answer = releaseList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
