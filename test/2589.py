from collections import deque

N, M = map(int, input().split())

arr = []

for _ in range(N):
    row = list(input().strip())
    arr.append(row)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(cx, cy):
    visited = [[False] * M for _ in range(N)]
    queue = deque([(cx, cy, 0)])
    visited[cx][cy] = True
    maxDistance = 0

    while queue:
        x, y, distance = queue.popleft()
        maxDistance = max(maxDistance, distance) # 가장 먼 거리 저장

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and not visited[nx][ny] and arr[nx][ny] == 'L':
                visited[nx][ny] = True
                queue.append((nx, ny, distance+1)) # 거리를 1씩 늘려가면서 큐에 넣음

    return maxDistance

maxDistance = 0

for i in range(N):
    for j in range(M):
        if arr[i][j] == 'L':
            maxDistance = max(maxDistance, bfs(i, j))

print(maxDistance)