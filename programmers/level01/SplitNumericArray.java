package level01;

import java.util.ArrayList;
import java.util.Collections;

public class SplitNumericArray {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.size()==0) list.add(-1);
        Collections.sort(list);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
