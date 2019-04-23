## Recusion

- 자기 자신을 호출하는 함수
- 순환, 재귀


```java
class Recursion{
 public static void func(int n){
     if(n<0){
         return;
     }
     System.out.println("recursion.." + n);
     func(n-1);
  }   
}
 
```
- base case (적어도 하나의 recursion에 빠지지 않는 경우)와 recursive case(recursion을 통해 base case에 수렴)가 존재해야 무한루프에 빠지지 않는다.


## Example

### 지수 값 구하기
- x의 n승

### Factorial
- 0! = 1
- n! = n(n-1)!  n>0


### Fibonacci Number
- f0 = 0
- f1 = 1
- fn = fn-1 + fn-2    if n>1


### euclid method(GCD: 최대 공약수)

- m>=n 에서 m이 n의 배수이면 GCD(m,n) = n, 그렇지 않으면 GCD(m,n) = GCD(n,m%n) 이다.



