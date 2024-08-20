import heapq
import sys

input = sys.stdin.readline

heap = []

# 출력을 모아둘 리스트
results = [] # 시간 초과가 계속 나서 리스트에 모아놓고 한번에 출력하는 방법을 선택

limit = int(input().strip())

for _ in range(limit):
    x = int(input().strip())
    
    if x == 0:
        if heap: # 힙이 비어있지 않을때 pop
            results.append(str(-heapq.heappop(heap)))  
        else:
            results.append("0")  # 힙이 비어있으면 0 추가
    else:
        heapq.heappush(heap, -x)  # 음수로 변환해 최대 힙 푸쉬


sys.stdout.write("\n".join(results) + "\n") # 한번에 개행문자 추가해서 출력
