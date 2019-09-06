package level02;

import java.util.Arrays;
//최대 2명

public class SavingBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int index = people.length - 1;
        for(int i = 0; i <= index; i++){
            answer++;
            while(index > i && people[i] + people[index--] > limit)
                answer++;
        }

        return answer;
    }
}
