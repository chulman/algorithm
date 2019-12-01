//세 개의 정수 A, B 및 K가 주어지면 K로 나눌 수있는 [A..B] 범위 내의 정수 수를 반환합니다.
//{ i : A ≤ i ≤ B, i mod K = 0 }
public class CountDivide {
    public int solution(int A, int B, int K) {
        if(A == B && A % K != 0) {
            return 0;
        } else if(A == B && A % K == 0) {
            return 1;
        }

        int total = (B/K) - (A > 0 ? ((A-1)/K) : 0);

        if(A == 0) total++;

        return total;
    }
}
