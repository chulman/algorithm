package level02;


public class BigNumber {
    public String solution(String number, int k) {
        int pos = 0;
        int remainK = number.length() - k;
        StringBuilder builder = new StringBuilder();
        while(remainK > 0){
            int max = 0;
            for(int i=pos; i<= number.length() - remainK; i++){
                if(max < number.charAt(i)){
                    max = number.charAt(i);
                }
            }
            for(int j= pos; j <= number.length() - remainK; j++){
                Character peek = number.charAt(j);
                if(max == peek){
                    builder.append(peek);
                    pos = j+1;
                    remainK--;
                    break;
                }
            }
        }
        return builder.toString();
    }


}
