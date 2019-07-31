import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2846 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int arr[] = new int[N];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int max = 0;
        int pos = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j - 1] >= arr[j]) {
                int riding = arr[j - 1] - arr[pos];
                if (max < riding) {
                    max = riding;
                }
                pos = j;
            } else {
                if (j == arr.length - 1) {
                    int riding = arr[j] - arr[pos];
                    if (max < riding) {
                        max = riding;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
