package level01;


public class PrimaryNumber {
    //에라토스테네스의 체
    public int solution(int n) {
        int answer = 0;

        boolean[] check = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (check[i] == false) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }
        return answer;
    }
}
