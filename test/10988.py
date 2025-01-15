word = input()
result = 1

for i in range(len(word) // 2):
    if word[i] != word[-(i+1)]:
        result = 0
        break

if result == 1:
    print(1)
else:
    print(0)