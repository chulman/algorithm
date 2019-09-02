package level03;

import java.util.Arrays;

public class DynamicTriangle {


    public int solution(int[][] triangle) {

        int[][] copy = new int[triangle.length][];
        for (int i=0; i <triangle.length; i++) {
            copy[i] = Arrays.copyOf(triangle[i], triangle[i].length);
        }

        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<=i; j++){
                //처음
                if(j==0) {
                    copy[i][j] = copy[i - 1][j] + triangle[i][j];
                //마지막
                } else if(j == i){
                    copy[i][j] = copy[i-1][j-1] + triangle[i][j];
                //나머지
                } else {
                    int left = copy[i-1][j-1] + triangle[i][j];
                    int right = copy[i][j] + triangle[i-1][j];

                    if(left > right) {
                        copy[i][j] = left;
                    } else {
                        copy[i][j] = right;
                    }
                }
            }
        }

        int answer = Arrays.stream(copy[copy.length-1]).max().getAsInt();
        return answer;
    }


}