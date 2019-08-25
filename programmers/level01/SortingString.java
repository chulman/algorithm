package level01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString {
    public String[] solution(String[] strings, int n) {
        List<String> answer =  Arrays.stream(strings)
                                    .sorted((o1, o2) -> {
                                        if(o1.charAt(n) > o2.charAt(n)){
                                            return 1;
                                        } else if( o1.charAt(n) < o2.charAt(n)){
                                            return -1;
                                        }  else {
                                            return o1.compareTo(o2);
                                        }
                                    })
                                    .collect(Collectors.toList());

        return answer.toArray(new String[answer.size()]);
    }
}