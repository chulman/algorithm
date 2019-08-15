package level01;


import java.util.*;

public class UnCompletePlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if(map.get(participant[i]) == null) {
                map.put(participant[i], 1);
            } else {
                // 똑같은 이름이 있으면 1번 더 추가
                map.put(participant[i], map.get(participant[i]) + 1);
            }

        }
        for (int i = 0; i < completion.length; i++) {
            // 없을 순 없지만 예외처리
            if(map.get(completion[i]) == null) {
                break;
            } else {
                if(map.get(completion[i])>1) {
                    map.put(completion[i], map.get(completion[i])-1);
                } else {
                    map.remove(completion[i]);
                }
            }
        }

        answer = map.keySet().iterator().next();
        return answer;
    }

    public static void main(String[] args) {
        UnCompletePlayer player = new UnCompletePlayer();
        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"kiki", "eden", "leo"};

        player.solution(participant, completion);
    }
}
