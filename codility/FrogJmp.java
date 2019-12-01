//X에 있고, Y이상 가고 싶어하며 고정 거리 D를 점프한다.
//목표에 도달하기 위한 최소 점프카운트를 구하라
class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y-X;
        int answer = distance / D;
        if(distance % D != 0){
            answer++;
        }
        return answer;
    }
}