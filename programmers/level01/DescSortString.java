package level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class DescSortString {
    public String solution(String s) {
        StringJoiner joiner = new StringJoiner("");

        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i=0; i<list.size(); i++){
            joiner.add(Character.toString(list.get(i)));
        }
        return joiner.toString();
    }
}
