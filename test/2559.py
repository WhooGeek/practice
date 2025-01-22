count, num = map(int, input().split())
box = list(map(int, input().split()))

calculation = [0] * (count+1)

result = []

for i in range(1, count+1):
    calculation[i] = calculation[i-1] + box[i-1]

for j in range(count - num + 1):
    result.append(calculation[j+num] - calculation[j])

print(max(result))