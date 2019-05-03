"""
반드시 for문을 사용.
append, insert 메소드와 del 함수를 사용하면 안됩니다.
자동 채점 과제이기 때문에, 문제의 조건에 정확히 따라주시기 바랍니다. 띄어쓰기도 일치해야 합니다.
"""


def is_palindrome(word):
    reverse_word = ""

    for i in range(len(word)):
        reverse_word = reverse_word + word[len(word) - i - 1]

    return reverse_word == word


# 테스트
print(is_palindrome("racecar"))
print(is_palindrome("stars"))
print(is_palindrome("토마토"))
print(is_palindrome("kayak"))
print(is_palindrome("hello"))
