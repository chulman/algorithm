import java.util.Arrays;

public class TapeEquilibrium {
    //비어있지 않은 배열 A
    // 테이프의 숫자
    // 0 < P < N
    //2..100,000 N의 범위
    // 차의 절대값의 최소 값을 반환
    //−1,000..1,000
    public int solution(int[] A) {
        //테이프의 개수는 1~N-1
        int min = Integer.MAX_VALUE;
        int rightSum = 0;
        int leftSum = 0;

        for(int i=0; i<A.length; i++){
            rightSum += A[i];
        }
        for(int i=1; i<A.length; i++){
            leftSum += A[i-1];
            rightSum -= A[i-1];
            int abs = Math.abs(leftSum - rightSum);
            if(abs < min) {
                min = abs;
            }
        }
        return min;
    }

    public static void main(String[] args){
        System.err.println(new TapeEquilibrium().solution(new int[]{-20,0,-30,-40}));
        System.err.println(new TapeEquilibrium().solution(new int[]{0,10}));
        System.err.println(new TapeEquilibrium().solution(new int[]{0,0}));
    }

}
