package level01;

import java.util.Arrays;

public class GetAverage {
    public double solution(int[] arr) {
        double avg = Arrays.stream(arr).average().getAsDouble();
        return avg;
    }
}
