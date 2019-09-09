package level02;

import java.util.*;

public class Disguise {

    public static Map<String, Integer> map = new HashMap<>();

    public int solution(String[][] clothes) {
        int answer = 1;
        for (int i = 0; i < clothes.length; i++) {
            String kind = clothes[i][1];
            if (map.get(kind) == null) {
                map.put(kind, 1);
            } else {
                map.put(kind, map.get(kind)+1);
            }
        }

        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()){
            String key = iter.next();
            answer *= (map.get(key)+1);
        }
        return answer-1;
    }
}
