package level03;

import java.util.Arrays;

public class Scale {
    public int solution(int[] weight) {
        Arrays.sort(weight);

        int answer = 1;

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] > answer) {
                break;
            }
            answer += weight[i];
        }
        return answer;
    }
}