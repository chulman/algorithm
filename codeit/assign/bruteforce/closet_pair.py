# 제곱근 사용을 위한 sqrt 함수
from math import sqrt


# 두 매장의 직선 거리를 계산해 주는 함수
def distance(store1, store2):
    return sqrt((store1[0] - store2[0]) ** 2 + (store1[1] - store2[1]) ** 2)

# 시간 복잡도 O(n2)
# 가장 가까운 두 매장을 찾아주는 함수
def closest_pair(coordinates):
    # 여기 코드를 쓰세요

    min_values = None
    close_location = [[], []]
    for x in range(len(coordinates)):
        for y in range(len(coordinates)):
            distance_val = int(distance(coordinates[x], coordinates[y]))

        if min_values == None and distance_val != 0:
            min_values = distance_val
            min_values = min(min_values, distance_val)

        if min_values == distance_val:
            close_location[0] = coordinates[x]
            close_location[1] = coordinates[y]
    return close_location


# 테스트
test_coordinates = [(2, 3), (12, 30), (40, 50), (5, 1), (12, 10), (3, 4)]
print(closest_pair(test_coordinates))
