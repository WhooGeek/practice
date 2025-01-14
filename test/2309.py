from itertools import combinations

height = []
for i in range(9):
    num = int(input())
    height.append(num)

# combinations 가능한 모든 조합 만듬 -> 이걸 순차적으로 검토하는거임
for result in combinations(height, 7):
    if sum(result) == 100:

        for num in sorted(result):
            print(num)
        break