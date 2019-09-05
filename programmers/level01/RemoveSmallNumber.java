package level01;

import java.util.Arrays;

public class RemoveSmallNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr).filter(value -> value!=min).toArray();
        }
        return answer;
    }
}
