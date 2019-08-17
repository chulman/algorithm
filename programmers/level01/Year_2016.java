package level01;

import java.util.*;

public class Year_2016 {
    public String solution(int a, int b) {
        String answer = "";
        String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a-1);
        cal.set(Calendar.DAY_OF_MONTH, b);
        answer = weeks[cal.get(Calendar.DAY_OF_WEEK) -1];
        return answer;
    }
}
