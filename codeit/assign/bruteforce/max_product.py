"""
함수 max_product는 리스트 left_cards와 리스트 right_cards를 파라미터로 받습니다.

left_cards는 왼쪽 카드 뭉치의 숫자들, right_cards는 오른쪽 카드 뭉치 숫자들이 담겨 있고,
max_product는 left_cards에서 카드 하나와 right_cards에서 카드 하나를 뽑아서 곱했을 때 그 값이 최대가 되는 값을 리턴합니다.
"""


# 시간 복잡도는 O(lr)

def max_product(left_cards, right_cards):
    max_values = 0
    for i in left_cards:
        for j in right_cards:
            max_values = max(max_values, i*j)
            # mul = i * j
            # if max_values < mul:
            #     max_values = mul
    return max_values


# 테스트
print(max_product([1, 6, 5], [4, 2, 3]))
print(max_product([1, -9, 3, 4], [2, 8, 3, 1]))
print(max_product([-1, -7, 3], [-4, 3, 6]))
