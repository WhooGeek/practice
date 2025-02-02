from collections import deque

N, M = map(int, input().split())

ary = []

for _ in range(N):
    row = list(map(int, input().strip()))
    ary.append(row)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and ary[nx][ny] == 1:
                ary[nx][ny] = ary[x][y] + 1
                queue.append((nx, ny))
    return ary[N-1][M-1]

print(bfs(0, 0))