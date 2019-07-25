import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10989 {
    private static int[] arr = null;
    public static void main(String[] args) throws Exception{
        //N(1 ≤ N ≤ 10,000,000)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        arr = new int[N];

        for(int i=0; i<N; i++){
            int n = Integer.parseInt(reader.readLine());
            arr[i] = n;
        }

        //quick sort n(logN)
        Arrays.sort(arr);

        StringBuffer buffer = new StringBuffer();

        for(int i=0; i<arr.length; i++){
            buffer.append(arr[i]);
            buffer.append("\n");
        }
        System.out.println(buffer.toString());
        reader.close();
    }
}
