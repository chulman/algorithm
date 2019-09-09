package level02;

import java.util.*;

public class Disguise {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, List<String>> map = new HashMap<>();


        for(int i=0; i<clothes.length; i++){
            String value = clothes[i][0];
            String kind = clothes[i][1];
            if(map.get(kind) == null){
                List list = new ArrayList();
                list.add(value);
                map.put(kind, list);
            } else {
                map.get(kind).add(value);
            }
        }

        Iterator<String> iter = map.keySet().iterator();

        while(iter.hasNext()){
            String list = iter.next();
        }

        return answer;
    }
}
