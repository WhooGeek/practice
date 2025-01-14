value = []

for i in range(9):
    num = int(input())
    value.append(num)
    
max = value[0]

for i in value:
    
    if max < i:
        max = i

print(max)
print((value.index(max))+1)