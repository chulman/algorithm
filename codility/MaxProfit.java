import java.util.Arrays;

public class MaxProfit {

    public int solution(final int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int buy = A[0];
        int profit = 0;
        for (int idx = 1; idx < A.length; idx++) {
            int value = A[idx];
            profit = Math.max(profit, value - buy);
            buy = Math.min(buy, value);
        }
        return profit;
    }
    //시간 초과
//    public int solution(int[] A) {
//        int maxProfit = 0;
//        for (int i = 0; i < A.length; i++) {
//            int[] copy = Arrays.copyOfRange(A, i + 1, A.length);
//            Arrays.sort(copy);
//
//            if (copy.length > 0) {
//                int profit = copy[copy.length-1] - A[i];
//                if (maxProfit < profit) {
//                    maxProfit = profit;
//                }
//            }
//        }
//        return maxProfit;
//    }

    public static void main(String[] args) {
        System.err.println(new MaxProfit().solution(new int[]{21013, 21123, 21366, 21011, 21367}));
    }
}