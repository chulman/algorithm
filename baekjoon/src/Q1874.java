import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringJoiner;

public class Q1874 {

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        StringJoiner join = new StringJoiner("\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int pos = 0;

        for (int i = 0; i < num; i++) {
            int peek = Integer.parseInt(br.readLine());

            if (pos < peek) {
                for (int j = pos; j < peek; j++) {
                    stack.push(j + 1);
                    join.add("+");
                }
                pos = peek;
            }
            int pop = stack.pop();

            if (pop != peek) {
                System.out.println("NO");
                return;
            }
            join.add("-");
        }

        System.out.println(join.toString());
        br.close();
    }
}
