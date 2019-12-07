public class TieRopes {
    public int solution(int K, int[] A) {
        //K보다 크거나 같은 수를 만들 수 있는 최대 rope 수
        // greedy
        int result = 0;
        int length = 0;
        for(int i=0; i<A.length; i++){
            length += A[i];
            if(length >= K){
                result++;
                length = 0;
            }
        }
        return result;
    }

}


