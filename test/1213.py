names = input().strip()
count = 0
box = [0] * 26 
left = []
mid = []

for name in names:
    box[ord(name) - 65] += 1  # 'A'는 65, ord(name) - 65

for i in range(26):
    if box[i] % 2 != 0:
        count += 1

if count > 1: 
    print("I'm Sorry Hansoo")
else:
    for i in range(26):
        left.extend([chr(i + 65)] * (box[i] // 2))

    for i in range(26):
        if box[i] % 2 != 0:
            mid.append(chr(i + 65))

    result = ''.join(left + mid + left[::-1])
    print(result)