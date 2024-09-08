a, b = map(int, input().split())

arr = []
for i in range(a):
    row = list(input())
    arr.append(row)



result = []

for i in range(a):
    cnt = -1
    rowResult = []    
    for j in range(b):
        if arr[i][j] == 'c':
            cnt = 0
            rowResult.append(cnt)
        elif cnt >= 0 and arr[i][j] == '.':
            cnt += 1
            rowResult.append(cnt)
        else:
            rowResult.append(cnt)
            
    result.append(rowResult)


for i in range(a):
    for j in range(b):
        print(result[i][j], end = " ")
    print()