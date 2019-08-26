package level01;

import java.util.StringJoiner;

public class StrangerString {
    public String solution(String s) {
        StringJoiner joiner = new StringJoiner("");

        int pos = 0;

        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(Character.toString(ch).equals(" ")) {
                joiner.add(Character.toString(ch));
                pos = 0;
            } else {
                if(pos%2==0){
                    joiner.add(Character.toString(ch).toUpperCase());
                }else{
                    joiner.add(Character.toString(ch).toLowerCase());
                }
                pos++;
            }
        }
        return joiner.toString();
    }
}
