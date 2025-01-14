num = [0]*30
diff = [0]*28

for i in range(30):
    num[i] = i+1

for i in range(28):
    a = int(input())
    diff[i] = a
    
set_A = set(num)
set_B = set(diff)

result = set_A - set_B

sort_result = sorted(result)

print(sort_result[0])
print(sort_result[1])