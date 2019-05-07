"""
예시
예를 들어 [1, 2, 3, 5, 8, 13, 21, 34, 55]에서 3을 찾는 경우, 알고리즘의 진행 방식은 다음과 같습니다:

시도 1
리스트의 첫 번째 인덱스와 마지막 인덱스의 값을 합하여 2로 나눈 후, 중간 인덱스로 지정합니다. 그리고 그 인덱스에 해당하는 값이 3인지 확인해봅니다.

이 경우 리스트의 첫 번째 인덱스는 0이고 마지막 인덱스는 8이기 때문에, 중간 인덱스는 4이고 해당 원소는 8입니다. 찾고자 하는 원소(3)는 중간 원소(8)에 비해 작습니다. 리스트는 정렬되어 있으니, 이제 인덱스 4~8은 탐색 범위에서 제외시킬 수 있습니다. 탐색 범위가 절반으로 줄어든 것이죠.

시도 2
탐색 범위는 이제 인덱스 0~3입니다. 탐색 범위의 첫 번째 인덱스는 0이고 마지막 인덱스는 3이기 때문에, 중간 인덱스는 (0 + 3) // 2인 1입니다. 인덱스 1에 해당하는 원소는 2이죠.

찾고자 하는 원소(3)는 중간 원소(2)에 비해 큽니다. 리스트는 정렬되어 있으니, 이제 인덱스 0~1은 탐색 범위에서 제외시키면 됩니다. 탐색 범위가 다시 절반으로 줄어든 것이죠.

시도 3
탐색 범위는 이제 인덱스 2~3입니다. 탐색 범위의 리스트의 첫 번째 인덱스는 2이고 마지막 인덱스는 3이므로, 중간 인덱스는 (2 + 3) // 2인 2입니다. 인덱스 2에 해당하는 원소의 값은 3이죠.

찾고자 하는 원소(3)는 중간에 해당하는 원소(3)와 일치합니다. 값을 찾았으니, 인덱스 2를 리턴해주며, 알고리즘을 종료합니다.

"""

# 해설
# noinspection PyInterpreter
""" 
def binary_search(element, some_list):
    start_index = 0
    end_index = len(some_list) - 1

    while start_index <= end_index:
        midpoint = (start_index + end_index) // 2
        if some_list[midpoint] == element:
            return midpoint
        elif some_list[midpoint] > element:
            end_index = midpoint - 1
        else:
            start_index = midpoint + 1
    return None
"""


def binary_search(element, some_list):
    # 코드를 작성하세요.
    mid_idx = int(len(some_list) / 2)
    mid_val = some_list[mid_idx]

    while True:
        if mid_val == element:
            return mid_idx
        elif mid_val < element:
            mid_idx = int((mid_idx + len(some_list)) / 2)
            mid_val = some_list[mid_idx]

            if mid_idx == len(some_list) and mid_val == element:
                return mid_idx
            elif mid_idx == len(some_list) and mid_val != element:
                return None

        elif mid_val > element:
            mid_idx = int(mid_idx / 2)
            mid_val = some_list[mid_idx]
            if mid_idx == 0 and mid_val == element:
                return mid_idx
            elif mid_idx == 0 and mid_val != element:
                return None


print(binary_search(2, [2, 3, 5, 7, 11]))
print(binary_search(0, [2, 3, 5, 7, 11]))
print(binary_search(5, [2, 3, 5, 7, 11]))
print(binary_search(3, [2, 3, 5, 7, 11]))
print(binary_search(11, [2, 3, 5, 7, 11]))
