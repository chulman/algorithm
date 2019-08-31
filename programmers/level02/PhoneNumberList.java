package level02;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Boolean> map = new HashMap();

        for (int i = 0; i < phone_book.length; i++) {
            if (map.get(phone_book[i]) == null) {
                for(int j=0; j<phone_book.length; j++){
                    if(i!=j && phone_book[j].startsWith(phone_book[i])){
                        answer = false;
                        break;
                    }
                }
                if(answer == false){
                    break;
                } else {
                    map.put(phone_book[i], true);
                }
            }
        }
        return answer;
    }
}
