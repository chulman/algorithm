package level01;

import java.util.StringJoiner;

public class MaskingPhoneNumber {
    public String solution(String phone_number) {
        String answer = "";

        int preLen = phone_number.substring(0, phone_number.length()-4).length();

        for(int i=0; i<preLen; i++){
            answer += "*";
        }
        answer = answer + phone_number.substring(preLen);
        System.out.println(answer);

        return answer;
    }
}
