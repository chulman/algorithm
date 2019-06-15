import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Q10828 {
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        StringJoiner join = new StringJoiner("\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) {
            String line = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            String subStart = tokenizer.nextToken();

            if (subStart.equals("push")) {
                int input = Integer.parseInt(tokenizer.nextToken());
                stack.push(input);
            } else if (subStart.equals("pop")) {
                if (stack.isEmpty()) {
                    join.add(String.valueOf(-1));
                } else {
                    int output = stack.pop();
                    join.add(String.valueOf(output));
                }

            } else if (subStart.equals("top")) {
                if (stack.isEmpty()) {
                    join.add(String.valueOf(-1));
                } else {
                    int output = stack.get(stack.size()-1);
                    join.add(String.valueOf(output));
                }

            } else if (subStart.equals("size")) {
                join.add(String.valueOf(stack.size()));
            } else if (subStart.equals("empty")) {
                int empty = stack.empty() == true ? 1 : 0;
                join.add(String.valueOf(empty));
            }
            testCase--;
        }
        System.out.println(join.toString());

        br.close();

    }
}
