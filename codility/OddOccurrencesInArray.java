
import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        if(A.length==1){
            return A[0];
        }
        Arrays.sort(A);
        int answer = 0;
        for(int i=0; i<A.length; i+=2){
            if(i+1 == A.length){
                answer = A[i];
                break;
            }
            if(A[i] != A[i+1]){
                answer = A[i];
                break;
            }
        }
        return answer;
    }
}
