package level01;


import java.util.*;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Map<Integer, Boolean> borrowHistory = new HashMap<>();
        for (int i = 0; i < reserve.length; i++) {
            borrowHistory.put(reserve[i], false);
        }
        for (int i = 0; i < lost.length; i++) {
            if (borrowHistory.get(lost[i]) != null) {
                borrowHistory.put(lost[i], true);
                lost[i] = -1;
            }
        }
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != -1) {
                if (borrowHistory.get(lost[i] - 1) != null && borrowHistory.get(lost[i] - 1) == false) {
                    borrowHistory.put(lost[i] - 1, true);
                    continue;
                }
                if (borrowHistory.get(lost[i] + 1) != null && borrowHistory.get(lost[i] + 1) == false) {
                    borrowHistory.put(lost[i] + 1, true);
                    continue;
                }
                n--;
            }
        }

        answer = n;
        return answer;
    }
}
