from collections import deque


N, L, R = map(int, input().split())

arr = []

for _ in range(N):
    row = list(map(int, input().split()))
    arr.append(row)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y, visited):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = True
    union = [(x, y)]
    total = arr[x][y]

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y+dy[i]
            if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny]:
                if L <= abs(arr[x][y] - arr[nx][ny]) <= R: # 절대값이 l과 r사이에 있을때
                    queue.append((nx, ny))
                    visited[nx][ny] = True
                    union.append((nx, ny)) # 연합에 추가하고
                    total += arr[nx][ny] # 총합도 계산
    return union, total

def move():
    visited = [[False] * N for _ in range(N)]
    nowMove = False

    for i in range(N):
        for j in range(N):
            if not visited[i][j]:
                union, total = bfs(i, j, visited)
                if len(union) > 1: # 연합이 2개 이상일때 시작
                    nowMove = True
                    avg = total // len(union) # 평균값을 구하는거죠
                    for x, y in union:
                        arr[x][y] = avg # 평균값 할당
    return nowMove

day = 0
while True:
    if not move():
        break # 이동이 없다면 종료
    day += 1

print(day)