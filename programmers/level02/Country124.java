package level02;

public class Country124 {
    public String solution(int n) {
        String answer = "";
        int[] arr = {4,1,2};

        int remain = 0;
        while(n>0){
            remain = n % 3;
            n = n / 3;

            if(remain==0) {
                n -= 1;
            }
            answer = arr[remain] + answer;
        }
        return answer;
    }

    public static void main(String[] args){
        Country124 a = new Country124();
        System.out.println(a.solution(4));
    }
}
