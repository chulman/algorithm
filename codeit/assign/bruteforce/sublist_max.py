# 우선 함수 sublist_max는 파라미터로 리스트 profits를 받는데요. profits에는 며칠 동안의 수익이 담겨 있습니다
# 예를 들어서 profits가 [7, -3, 4, -8]이라면 첫 날에는 7달러를 벌었고, 둘째 날에는 3달러를 잃었고, 셋째 날에는 4달러를 벌었고, 마지막 날에는 8달러를 잃은 거죠.
#
# sublist_max 함수는 profits에서 최대 수익을 내는 구간의 수익을 리턴합니다.
#
# profits가 [7, -3, 4, -8]이라면 무엇을 리턴해야 할까요? profits에서 가장 많은 수익을 낸 구간은 [7, -3, 4]입니다. 이 구간에서 낸 수익은 8달러이니, 8을 리턴하면 되겠죠!
#
# 만약 profits가 [-2, -3, 4, -1, -2, 1, 5, -3]이라면? profits에서 수익이 가장 큰 구간은 [4, -1, -2, 1, 5]입니다. 이 구간에서 낸 수익은 7달러이니, 7을 리턴하겠죠?


def sublist_max(profits):
    # 코드를 작성하세요.
    max_profit = []
    for i in range(0, len(profits) - 1):
        max_sum = profits[i]
        for j in range(i + 1, len(profits)):
            max_sum = max_sum + profits[j]

            if max_sum > sum(max_profit):
                max_profit = profits[i:j+1]

    return sum(max_profit)


# 테스트
print(sublist_max([4, 3, 8, -2, -5, -3, -5, -3]))
print(sublist_max([2, 3, 1, -1, -2, 5, -1, -1]))
print(sublist_max([7, -3, 14, -8, -5, 6, 8, -5, -4, 10, -1, 8]))
