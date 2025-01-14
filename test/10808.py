word = input()

result = []
for i in range(26):
    count = 0
    for j in range(len(word)):
        if ord(word[j]) == i+97:
            count += 1
    result.append(count)

print(*result)