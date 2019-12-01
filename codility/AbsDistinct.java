import java.util.*;

public class AbsDistinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> distinctMap = new HashMap<>();
        for(int i=0; i<A.length; i++){
            int abs = Math.abs(A[i]);
            if(!Optional.ofNullable(distinctMap.get(abs)).isPresent()){
                distinctMap.put(abs, 1);
            }
        }
        return distinctMap.size();
    }
}
