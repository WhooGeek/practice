import sys

q = int(sys.stdin.readline().strip())

arr = []
for _ in range(q):
    team, time = sys.stdin.readline().split()
    team = int(team)
    minutes, seconds = map(int, time.split(':'))
    total = minutes * 60 + seconds # 다 초로 변환
    arr.append((team, total))

# 경기 시간
TOTAL_TIME = 48 * 60 # 초로 변환

team1 = 0
team2 = 0
lastT = 0
score1 = 0
score2 = 0

def format_time(seconds):
    minutes = seconds // 60
    seconds = seconds % 60
    return f"{minutes:02}:{seconds:02}"

for team, currentT in arr:
    if score1 > score2:
        team1 += currentT - lastT
    elif score2 > score1:
        team2 += currentT - lastT
    
    if team == 1:
        score1 += 1
    else:
        score2 += 1
    
    lastT = currentT

# 마지막으로 시간 기준 이기고 있던 시간 추가
if score1 > score2:
    team1 += TOTAL_TIME - lastT

elif score2 > score1:
    team2 += TOTAL_TIME - lastT
    


print(format_time(team1))
print(format_time(team2))