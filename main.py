# 문제 5
# 주어진 숫자가 소수인지 확인하는 함수 정의
def is_prime(number):
    if number <= 1:  # 주어진 숫자가 1 이하인 경우
        return False  # 소수가 아니므로 False 반환
    for i in range(2, number):  # 2부터 number-1까지의 수에 대해 반복
        if number % i == 0:  # number가 i로 나누어 떨어지는 경우
            return False  # 소수가 아니므로 False 반환
    return True  # 위의 경우에 해당하지 않으면 소수이므로 True 반환

def calculate_average(list):
    total = 0  # 총합을 저장할 변수를 초기화합니다.
    for i in list:  # 리스트 l의 각 요소를 반복하며
        total += i  # 요소를 총합에 더합니다.
    count = len(list)  # 리스트의 요소 개수를 구합니다.

    return total / count  # 평균을 계산하여 반환합니다.

sum = 0
list = []
for i in range(100):
    if(is_prime(i) == True):
        list.append(i)
result = calculate_average(list)
print(result)adsfasdfasdfs
