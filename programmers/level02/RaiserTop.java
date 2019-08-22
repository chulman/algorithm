package level02;

import java.util.Arrays;
import java.util.Stack;

public class RaiserTop {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            stack.push(heights[i]);
        }

        int idx = heights.length - 1;
        while (!stack.isEmpty()) {
            int height = stack.pop();

            for (int j = idx - 1; j >= 0; j--) {
                if (height < heights[j]) {
                    answer[idx] = j+1;
                    break;
                }
            }
            idx--;
        }

        Arrays.stream(answer).forEach(System.out::print);
        return answer;
    }

    public static void main(String[] args) {
        new RaiserTop().solution(new int[]{1, 5, 3, 6, 7, 6, 5});
    }
}
