arr = [0]*10
cnt = 0


for i in range(10):
    a = int(input())
    b = a % 42
    arr[i] = b
    

set_A = set(arr) # 집합으로 만들면 중복값 제거

result = len(set_A) # 카운트

print(result)