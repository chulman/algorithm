import java.util.*;

public class BinaryGap {

    public int solution(int N) {
        List<Integer> list = new ArrayList<>();

        while(N / 2 > 1){
            if(N%2==1){
                list.add(getZeroCount(N));
            }
            N = N/2;
        }
        if(list.size()==0) return 0;
        return list.stream().max(Integer::compareTo).get();
    }

    public int getZeroCount(int N){
        N = N/2;
        if(N%2==1) return 0;
        return getZeroCount(N) + 1;
    }
}
