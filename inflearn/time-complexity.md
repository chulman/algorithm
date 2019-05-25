

## Overview
- 알고리즘의 자원 사용량(실행시간, 메모리..) 분석


## 시간복잡도
- 실행시간은 실행환경에 따라 달라진다
- 실행시간을 측정하는 대신 연산의 실행횟수를 카운트
- 연산의 실행 횟수는 입력 데이터의 크기에 관한 함수로 표현
- 데이터의 크기가 같더라도 실제 데이터에 따라 달라짐 (worst-case analysis, average-case analysis)

### 점근적 분석

- 점근적 표기법을 사용 : 데이터 개수가 무한대일때 수행시간이 증가하는 증가율로 시간복잡도를 표현

- 가장 좋은 분석법은 아니지만, 간단하고 실행환경에 비의존적이라 광범위하게 사용

ex) 상수 시간복잡도 O(1), 선형 시간복잡도 O(N..) : 순차탐색 



https://s3.ap-northeast-2.amazonaws.com/inflearnattachment/algorithm/chap01_time_complexity.pdf