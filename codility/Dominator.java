import java.util.*;

public class Dominator {
    public int solution(int[] A) {

        int dominator = 0;
        int dominatorCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                int addCnt = map.get(A[i])+1;
                map.put(A[i],addCnt);
                if (dominatorCount < addCnt) {
                    dominatorCount = addCnt;
                    dominator = A[i];
                }
            } else {
                map.put(A[i], 1);
            }
        }

        int answer = -1;
        if(A.length == 1) return 0;
        if (dominatorCount > (A.length/2)){
            for (int i=0; i<A.length; i++) {
                if (A[i] == dominator) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
