def fib_optimized(n):
    # 이미 계산된 피보나치 수를 담는 리스트
    prev = 1
    current = 1

    # n번째 피보나치 수까지 리스트를 하나씩 채워 나간다
    for i in range(3, n + 1):
        temp = current
        current = prev + current
        prev = temp

    # 피보나치 n번째 수를 리턴한다
    return current


# 테스트
print(fib_optimized(1))
print(fib_optimized(2))
print(fib_optimized(3))
print(fib_optimized(4))
print(fib_optimized(5))
