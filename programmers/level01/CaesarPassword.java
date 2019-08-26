package level01;
import java.util.StringJoiner;

public class CaesarPassword {
    public String solution(String s, int n) {

        StringJoiner joiner = new StringJoiner("");
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(Character.toString(ch).equals(" ")){
                joiner.add(Character.toString(ch));
            } else {
                if(ch >= 65 && ch<=90 && (ch+n) > 90 || (ch+n) > 122) {
                    joiner.add(Character.toString((char) (ch+n-26)));
                } else {
                    joiner.add(Character.toString((char) (ch+n)));
                }
            }
        }
        return joiner.toString();
    }
}
