import java.util.Arrays;


public class Triangle {
    //있으면 1 없으면 0
    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        //0<=P<Q<R<N

        for(int i=0; i<A.length-2; i++){
            if(A[i]<= 0){
                continue;
            }
            long p = A[i];
            long q = A[i+1];
            long r = A[i+2];

            if(p+q > r){
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        System.err.println(new Triangle().solution(new int[]{-1,2,4,-4,5}));
        System.err.println(new Triangle().solution(new int[]{0,0,0,0,0}));
        System.err.println(new Triangle().solution(new int[]{10, 2, 5, 1, 8, 20}));
        System.err.println(new Triangle().solution(new int[]{10, 50, 5, 1}));
    }
}
