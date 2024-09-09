import heapq

a = int(input())

arr = []

for i in range(a):
    d, c = map(int, input().split())
    arr.append((d, c))

arr.sort() # d 기준 정렬

result = []
for d, c in arr:
    heapq.heappush(result, c)

    if len(result) > d:
        heapq.heappop(result) # C가 낮은게 pop 됨

print(sum(result))
