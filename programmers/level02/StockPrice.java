package level02;

import java.util.ArrayDeque;
import java.util.Queue;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            queue.offer(prices[i]);
        }
        int pos = 0;
        while (!queue.isEmpty()) {
            int n = queue.poll();

            int idx = 0;
            for (int i = pos + 1; i < prices.length; i++) {
                if (prices[i] < n) {
                    idx = i;
                    break;
                }
            }
            if (idx == 0) {
                answer[pos] = prices.length - pos - 1;
            } else {
                answer[pos] = idx - pos;
            }
            pos++;
        }

        return answer;
    }
}
