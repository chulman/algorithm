package level01;

public class ReverseNumber {
    public int[] solution(long n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        String reverse = builder.reverse().toString();
        int[] answer = new int[reverse.length()];
        for(int i=0; i<reverse.length(); i++){
            answer[i] = Integer.valueOf(Character.toString(reverse.charAt(i)));
        }
        return answer;
    }
}
