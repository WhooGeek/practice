a = int(input())

arr = [] * a

arr = list(map(int, input().split()))

max = arr[0]

for i in range(a):
    if arr[i] > max:
        max = arr[i]

for i in range(a):
    arr[i] = arr[i]/max*100
   
result = sum(arr) / a

print(result)