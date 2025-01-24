import sys
input = sys.stdin.readline

N, M = map(int, input().split())

dict = {}
box = []

for i in range(N):
    pokemon = input().strip()
    dict[pokemon] = i + 1
    box.append(pokemon)
    
for _ in range(M):
    question = input().strip()
    if question.isdigit():
        index = int(question) - 1
        print(box[index])
    else:
        print(dict[question])