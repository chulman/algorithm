package level02;

import java.util.ArrayList;
import java.util.List;

// 영어 끝말읽기
public class EnglishEnding {

    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];

        List<String> wordsList = new ArrayList<>();
        int count = 0;
        char preChar = ' ';

        for (int i = 0; i < words.length; i++) {
            if (((i + 1) % n == 1)) count++;
            String word = words[i];
            if (!wordsList.contains(word)) {
                if (preChar != ' ' && preChar != word.charAt(0)) {
                    answer = answer(n, count, i);
                    break;
                }

                preChar = word.charAt(word.length() - 1);
                wordsList.add(word);
            } else {
                answer = answer(n, count, i);
                break;
            }
        }

        return answer;
    }

    private int[] answer(int n, int count, int i) {
        int[] answer = new int[2];
        if((i+1)%n == 0) answer[0] = n;
        else answer[0] = (i+1)%n;

        answer[1] = count;
        return answer;
    }
}
