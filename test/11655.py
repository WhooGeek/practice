code = input()
codeList = []
result = []

for i in range(len(code)):
    box = 0
    a = ord(code[i])
    if a >= 65 and a <= 77:
        box = a + 13            
    elif a >= 78 and a <= 90:
        box = a - 13
    elif a >= 97 and a <= 109:
        box = a + 13           
    elif a >= 110 and a <= 122:
        box = a - 13
    else:
        box = a

    codeList.append(box)
    
for j in range(len(codeList)):
    result.append(chr(codeList[j]))

print(*result, sep='')