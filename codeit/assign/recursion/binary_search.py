"""
Base case :  배열의 첫번째 혹은 마지막까지 탐색했는데도 없으면 return NONE
Recursive case:
     index는 배열의 중간 값, 비교해서 같으면 return index, 작으면 end_index = index, 크면 start_index = index ..

"""

# 시간복잡도는 lgn
def binary_search(element, some_list, start_index=0, end_index=None):
    if end_index is None:
        end_index = len(some_list) - 1

    index = round((start_index + end_index) / 2)

    if index == len(some_list) - 1 and some_list[index] != element:
        return None
    if index == 0 and some_list[index] != element:
        return None

    if some_list[index] == element:
        return index
    elif some_list[index] > element:
        end_index = index
    elif some_list[index] < element:
        start_index = index

    return binary_search(element, some_list, start_index, end_index)


print(binary_search(2, [2, 3, 5, 7, 11]))
print(binary_search(0, [2, 3, 5, 7, 11]))
print(binary_search(5, [2, 3, 5, 7, 11]))
print(binary_search(3, [2, 3, 5, 7, 11]))
print(binary_search(11, [2, 3, 5, 7, 11]))
