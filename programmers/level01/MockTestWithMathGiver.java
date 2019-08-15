package level01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTestWithMathGiver {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = {0, 0, 0};

        for(int i=0; i<answers.length; i++){
            if(answers[i] == student1[i%student1.length]) scores[0]++;
            if(answers[i] == student2[i%student2.length]) scores[1]++;
            if(answers[i] == student3[i%student3.length]) scores[2]++;
        }


        int max = Arrays.stream(scores).max().getAsInt();
        List<Integer> lists = new ArrayList<>();
        for(int i=0; i<scores.length; i++){
            if(scores[i]==max){
                lists.add(i+1);
            }
        }
        int answer[] = new int[lists.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = lists.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        MockTestWithMathGiver test= new MockTestWithMathGiver();
        test.solution(new int[]{1,2,3,4,5});
    }
}
