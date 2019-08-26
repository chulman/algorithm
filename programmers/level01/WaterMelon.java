package level01;

import java.util.StringJoiner;

public class WaterMelon {
    public String solution(int n) {
        String[] pattern = {"수", "박"};
        StringJoiner joiner = new StringJoiner("");
        for(int i=0; i<n; i++){
            joiner.add(pattern[i%2]);
        }
        return joiner.toString();
    }
}
