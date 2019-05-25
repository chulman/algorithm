def merge(list1, list2):
    merged_list = []

    i = 0
    j = 0

    # list1과 list2를 돌면서 merged_list에 추가
    while i < len(list1) and j < len(list2):
        if list1[i] > list2[j]:
            merged_list.append(list2[j])
            j += 1
        else:
            merged_list.append(list1[i])
            i += 1

    if i != len(list1):
        for k in range(i, len(list1)):
            merged_list.append(list1[k])

    if j != len(list2):
        for k in range(j, len(list2)):
            merged_list.append(list2[k])

    return merged_list


# 테스트
print(merge([1], []))
print(merge([], [1]))
print(merge([2], [1]))
print(merge([1, 2, 3, 4], [5, 6, 7, 8]))
print(merge([5, 6, 7, 8], [1, 2, 3, 4]))
print(merge([4, 7, 8, 9], [1, 3, 6, 10]))
