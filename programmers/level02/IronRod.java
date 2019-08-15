package level02;
import java.util.*;

//쇠막대기 문제
class IronRod {
    public int solution(String arrangement) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<arrangement.length(); i++){
            if(arrangement.charAt(i)=='('){
                stack.push(arrangement.charAt(i));
            } else {
                stack.pop();

                if(arrangement.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
            System.out.println(answer +"," + arrangement.substring(0, i));
        }
        return answer;
    }

    public static void main(String[] args){
        IronRod ironRod = new IronRod();
        ironRod.solution("()(((()())(())()))(())");
    }
}