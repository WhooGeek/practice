r, c, t = map(int, input().split())
cnt = 0
room = []
result = 0

for i in range(r):
    row = list(map(int, input().split()))
    room.append(row)   

while cnt != t:
    # 미세먼지 확산 로직

    # 공청 작동 로직

    cnt += 1

# 남아있는 미세먼지의 양을 구하는 로직
for i in range(r):
    for j in range(c):
        if room[i][j] > 0:
            result += room[i][j]

print(result)