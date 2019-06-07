# 아래의 함수의 시간 복잡도는  ø(y)
# ø(lg y) 로 변경하라.

# def power(x, y):
#     total = 1
#     # x를 y번 곱해 준다
#     for i in range(y):
#         total *= x
#
#     return total


def power(x, y):
    if y == 0:
        return 1

    # 계산을 한 번만 하기 위해서 변수에 저장
    subresult = power(x, y // 2)

    # 문제를 최대한 똑같은 크기의 문제 두 개로 나눠준다 (짝수, 홀수 경우 따로)
    if y % 2 == 0:
        return subresult * subresult
    else:
        return x * subresult * subresult


print(power(3, 5))
print(power(5, 6))
print(power(7, 9))
