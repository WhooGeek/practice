from itertools import combinations


n, m =map(int, input().split())

arr = []

for _ in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

chicken = []
house = []

# 치킨집, 집 위치저장
for i in range(n):
    for j in range(n):
        if arr[i][j] == 2: # 치킨집 저장
            chicken.append((i, j))
        elif arr[i][j] == 1: # 집 저장
            house.append((i, j))

# 치킨거리 계산
def chckenDistance(chicken, house):
    resultDistance = 0
    for hx, hy in house:
        minDistance = float('inf') # 실제값이 초기값보다 일단 작아야하니깐 큰값으로 초기화
        for cx, cy in chicken:
            cDistance = abs(hx - cx) + abs(hy - cy)
            minDistance = min(minDistance, cDistance)
        resultDistance += minDistance
    return resultDistance

#가능한 모든 치킨집 조합 생성
minCDistcance = float('inf') # 실제값이 초기값보다 일단 작아야하니깐 큰값으로 초기화
for combChicken in combinations(chicken, m):
    CDistance = chckenDistance(combChicken, house)
    minCDistcance = min(minCDistcance, CDistance)

print(minCDistcance)