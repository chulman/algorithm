package level01;

import java.util.regex.Pattern;

public class HandleString {
    public boolean solution(String s) {
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, s) && (s.length()==4 || s.length()==6);
    }
}
