### 알고리즘의 시간복잡도

# - O(1) : Input의 크기가 영향을 시간의 영향을 미치지 않는다.

def print_first(my_list):
    print(my_list[0])


print_first([2, 3])
print_first([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53])


# - O(lgn)
# - O(n)

# O(n) 함수
def print_each(my_list):
    for i in range(len(my_list)):
        print(my_list[i])


def print_three_times(my_list):
    for i in range(len(my_list)):
        print(my_list[i])

    for i in range(len(my_list)):
        print(my_list[i])

    for i in range(len(my_list)):
        print(my_list[i])


# - O(nlgn)
# - O(n2)

def print_pairs(my_list):
    for i in range(len(my_list)):
        for j in range(len(my_list)):
            print(my_list[i], my_list[j])


# - O(n3)

# O(n^3) 함수
def print_triplets(my_list):
    for i in range(len(my_list)):
        for j in range(len(my_list)):
            for k in range(len(my_list)):
                print(my_list[i], my_list[j], my_list[k])


# - O(lgn)
# O(lg n) 함수
# 2의 거듭제곱을 출력하는 함수
# (이번에는 인풋이 리스트가 아니라 그냥 정소)
def print_powers_of_two(n):
    i = 1
    while i < n:
        print(i)
        i = i * 2
#
# O(nlgn)
# O(n2)은 O(n)과 O(n)이 중첩. 같은 논리로, O(nlgn)은 O(n)과 O(lgn)이 겹쳐진 것

def print_powers_of_two_repeatedly(n):
    for i in range(n): # 반복횟수: n에 비례
        j = 1
        while j < n: # 반복횟수: lg n에 비례
            print(i, j)
            j = j * 2



def print_powers_of_two_repeatedly(n):
    i = 1
    while i < n: # 반복횟수: lg n에 비례
        for j in range(n): # 반복횟수: n에 비례
            print(i, j)
        i = i * 2
