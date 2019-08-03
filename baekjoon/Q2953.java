import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2953 {
    private static int line = 5;
    private static int count = 4;
    private static int[][] cookScore = new int[line][count];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < line; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < count; j++) {
                cookScore[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        reader.close();
        calcMaxScore();

    }

    private static void calcMaxScore() {

        int index = -1;
        int max = 0;

        for (int i = 0; i < cookScore.length; i++) {
            int sum = 0;
            for (int j = 0; j < cookScore[i].length; j++)
                sum += cookScore[i][j];
            if (max < sum) {
                index = i;
                max = sum;
            }
        }

        System.out.println((index+1) + " " + max);
    }
}
