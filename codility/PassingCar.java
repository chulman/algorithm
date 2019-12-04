//배열의 연속도로
// 0은 동쪽 1은 서쪽
// 0<=동쪽<서쪽<N

public class PassingCar {
    public int solution(int[] A) {
        int passingCount = 0;
        int eastCar = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                eastCar += 1;
            } else {
                passingCount += eastCar * 1;
            }

            if(passingCount > 1000000000){
                return -1;
            }
        }
        return passingCount;
    }
}
