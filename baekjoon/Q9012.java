import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringJoiner;

public class Q9012 {

    private static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        StringJoiner join = new StringJoiner("\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) {

            boolean isFail = false;
            stack.clear();
            testCase--;

            String line = br.readLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                stack.push(ch);
                if (ch == ')') {
                    stack.pop();

                    if (stack.size() > 0) {
                        char pop = stack.pop();

                        if (!(pop == '(')) {
                            isFail = true;
                            break;
                        }
                    } else {
                        isFail = true;
                        break;
                    }

                }
            }
            if(stack.isEmpty() && isFail == false){
                join.add("YES");
            } else {
                join.add("NO");
            }
        }
        System.out.println(join.toString());
    }
}
