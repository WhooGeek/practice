from collections import deque

n = int(input())

matrix = []
max_num = 0

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
for _ in range(n):
    matrix.append(list(map(int, input().split())))
    max_num = max(max_num, max(matrix[-1]))

def bfs(x, y, r):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = 1

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx<0 or nx>=n or ny<0 or ny>=n:
                continue
            if visited[nx][ny] == 1 or matrix[nx][ny] <= r:
                continue
            queue.append((nx, ny))
            visited[nx][ny] = 1

result = 0
for i in range(max_num):
    count = 0
    visited = [[0]*n for _ in range(n)]
    for j in range(n):
        for k in range(n):
            if matrix[j][k] > i and visited[j][k] == 0:
                bfs(j, k, i)
                count += 1
    result = max(result, count)

print(result)
    

