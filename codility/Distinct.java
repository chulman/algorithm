import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        if(A.length == 0){
            return 0;
        }
        Arrays.sort(A);
        int count = 1;
        int prev = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i] != prev){
                count++;
                prev = A[i];
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.err.println(new Distinct().solution(new int[]{1,2,3,1,1}));
        System.err.println(new Distinct().solution(new int[]{0}));
    }
}
