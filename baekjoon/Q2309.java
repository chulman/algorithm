import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {
    private static int[] heightArr = new int[9];

    public static void main(String[] args) throws IOException {
        int nine_height_sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < heightArr.length; i++) {
            int height = Integer.parseInt(br.readLine());
            heightArr[i] = height;
            nine_height_sum+= height;
        }

        Arrays.sort(heightArr);

        int pos1 = 0;
        int pos2 = 0;
        for(int i=0; i< heightArr.length; i++){
            for(int j=i+1; j<heightArr.length; j++){
                if((nine_height_sum - heightArr[i] - heightArr[j]) == 100){
                    pos1 = i;
                    pos2 = j;
                }
            }
        }
        for(int i=0; i<heightArr.length; i++){
            if(i!= pos1 && i!=pos2) {
                System.out.println(heightArr[i]);
            }
        }
        br.close();
    }
}
