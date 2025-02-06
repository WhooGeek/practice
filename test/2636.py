from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs():
    visited = [[False] * m for _ in range(n)]
    queue = deque([(0, 0)])  
    visited[0][0] = True
    mcheese = [] # 녹은 치즈
    
    # 접촉 치즈 찾기
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny]:
                if grid[nx][ny] == 1:
                    grid[nx][ny] = 0  # 치즈가 녹음
                    mcheese.append((nx, ny))  # 녹은 치즈 저장
                else:
                    queue.append((nx, ny)) # 방문하지 않은 곳 큐에 넣음
                visited[nx][ny] = True
    
    return len(mcheese)

# 입력 받기
n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

time = 0
last_cheese = 0

while True:
    mcheese = bfs()  # 치즈가 녹은 수
    if mcheese == 0:  # 더 이상 치즈가 없다면 종료
        break
    time += 1
    last_cheese = mcheese

print(time)
print(last_cheese)
