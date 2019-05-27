## Dynamic Programming의 조건

- Optimal Substructure(최적 부분 구조)
- Overlapping SUbproblem(중복되는 부분 문제)

 
- 중복되는 문제의 해결 => Dynamic Programming


## Dynamic Programming

- 한 번 계산한 결과를 재활용하는 방식

- Memoization
    + 중복되는 계산은 한번만 계산 후 메모 (Top-Down)
- Tabulation = Ø(n)
    + 테이블 방식으로 -> 상향식 접근(Bottom-up Approach)
    
    


## Memoization vs Tabulation

- 중복된 부분을 제거
- 재귀 vs 반복문

- Memoization은 재귀를 사용하므로 stack에 쌓임
- 하지만 필요없는 계산은 안해도 되므로 효율적일 수 있음.


## 공간 최적화

- prev와 current 변수를 활용 Ø(1)