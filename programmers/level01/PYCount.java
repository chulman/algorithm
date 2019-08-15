package level01;

// P와 Y의 개수
public class PYCount {
    boolean solution(String s) {

        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;

        for(int i=0; i<s.length(); i++){
            String character = Character.toString(s.charAt(i));

            if(character.equalsIgnoreCase("p")){
                pCnt++;
            }

            if(character.equalsIgnoreCase("y")){
                yCnt++;
            }
        }

        if(pCnt == yCnt || (pCnt==0 && yCnt==0))
            answer = true;
        else
            answer = false;

        return answer;
    }
}
