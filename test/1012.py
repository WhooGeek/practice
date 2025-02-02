from collections import deque

T = int(input())

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
                ary[nx][ny] = 0
                queue.append((nx, ny))

for _ in range(T):
    M, N, C = map(int, input().split())
    ary = [[0] * M for _ in range(N)]

    for _ in range(C):
        x, y = map(int, input().split())
        ary[y][x] = 1

    count = 0
    for i in range(N):
        for j in range(M):
            if ary[i][j] == 1:
                bfs(i, j)
                count += 1

    print(count)