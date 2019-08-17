package level01;

import java.util.*;

public class NotSequencialNumber {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        int preVal = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != preVal) {
                list.add(arr[i]);
            }
            preVal = arr[i];
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
