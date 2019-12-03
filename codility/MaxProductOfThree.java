import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int max = (A[A.length-3] * A[A.length-2]) * A[A.length-1];
        if(A[0] <= 0 && A[1] <= 0 && A.length-1 >=0){
            max = Math.max(max, A[0]* A[1] * A[A.length-1]);
        }
        return max;
    }

    public static void main(String[] args){
        System.err.println(new MaxProductOfThree().solution(new int[]{-10,-2,-4}));
    }
}
