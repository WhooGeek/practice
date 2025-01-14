import heapq
import sys

input = sys.stdin.read # 모든 데이터를 한번에 읽어서 input에 저장
data = input().strip().split() #data는 input에 있는걸 다닥 붙여논거고


heap = [] # 힙 배열
result = [] # 결과 리스트

index = 0 # 인덱스를 이용해서 data를 옮기는거야
limit = int(data[index])
index += 1
    
for _ in range(limit):
    x = int(data[index])
    index += 1
    if x == 0:
        if heap: # 힙에 내용이 있으면 pop인데 (절대값, 기존값) 을 넣어서 [1]로 기존값을 출력
            result.append(str(heapq.heappop(heap)[1]))
        else:
            result.append("0")
    else: # 넣을때 heap이라는 list에 절대값, 기존값을 같이 넣음
        heapq.heappush(heap, (abs(x), x))

sys.stdout.write("\n".join(result) + "\n")


