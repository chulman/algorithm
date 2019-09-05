package level02;

import java.util.*;

public class LargestNumber {
    public String solution(int[] numbers) {
        StringJoiner joiner = new StringJoiner("");

        List<String> strings = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            strings.add(String.valueOf(numbers[i]));
        }

        strings.sort((o1, o2) -> (o2+o1).compareTo(o1+o2));
        strings.forEach(joiner::add);

        String answer = joiner.toString();

        while(answer.startsWith("0")){
            if(answer.length() <= 1) break;
            answer = answer.substring(1);

        }
        return answer;
    }
}
