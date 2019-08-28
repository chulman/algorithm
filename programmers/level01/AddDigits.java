package level01;

public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String parse = String.valueOf(n);
        for(int i=0; i<parse.length(); i++){
            answer += Integer.valueOf(Character.toString(parse.charAt(i)));
        }
        return answer;
    }
}
