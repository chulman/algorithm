package level01;

import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int k = commands[i][2];
            int[] copyArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArr);
            answer[i] = copyArr[k-1];
        }
        return answer;
    }

    public static void main(String[] args){
        KNumber number = new KNumber();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        number.solution(arr,command);
    }
}
