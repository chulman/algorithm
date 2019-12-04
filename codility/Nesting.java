import java.util.Stack;

public class Nesting {
    public int solution(String S) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char charAt = S.charAt(i);
            stack.push(charAt);
            if (charAt == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop != '(') {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        }
        if(!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
