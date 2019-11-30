import java.util.Arrays;

public class Cyclicrotation {

    public int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];
        for(int i=0; i<A.length; i++){
            int index = ((i+K) % A.length);
            answer[index] = A[i];
        }
        return answer;
    }

    public static void main(String[] args){
        System.err.println(Arrays.toString(new Cyclicrotation().solution(new int[]{3,8,9,7,6}, 3)));
        System.err.println(Arrays.toString(new Cyclicrotation().solution(new int[]{0,0,0}, 1)));
    }
}
