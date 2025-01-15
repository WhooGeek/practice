a = int(input())
container = []
result = []

for _ in range(a):
    name = input()
    container.append(name)

for i in range(26):
    count = 0
    for j in range(len(container)):
        if ord(container[j][0]) == i+97:
            count += 1
            if count >= 5:
                result.append(container[j][0])

fin_result = list(set(result))

if result:
    print("".join(sorted(fin_result)))
else:
    print(f"PREDAJA")
