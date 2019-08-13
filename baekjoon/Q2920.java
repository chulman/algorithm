import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q2920 {
    public static void main(String[] args) throws IOException {
        List<Integer> lists = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        while (tokenizer.hasMoreTokens()) {
            lists.add(Integer.parseInt(tokenizer.nextToken()));
        }

        Integer[] origins = lists.toArray(new Integer[lists.size()]);
        Integer[] sorted = lists.toArray(new Integer[lists.size()]);

        Arrays.sort(sorted);

        if (Arrays.equals(origins, sorted)) {
            System.out.println("ascending");
        } else {
            Arrays.sort(sorted, Collections.reverseOrder());

            if (Arrays.equals(origins, sorted)) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        }
    }
}
