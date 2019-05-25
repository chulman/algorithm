def consecutive_sum(start, end):

    divide = int((start + end) / 2)

    # 코드를 작성하세요
    if start == end:
        return start

    return consecutive_sum(start, divide) + consecutive_sum(divide+1, end)


# 테스트
print(consecutive_sum(1, 10))
# print(consecutive_sum(1, 100))
# print(consecutive_sum(1, 253))
# print(consecutive_sum(1, 388))
