from queue import PriorityQueue

a = int(input())

que = PriorityQueue()

cnt = 0
result = 0

for i in range(a):
    b, c = map(int, input().split())
    que.put((b, -c))

while not que.empty():
    p, v = que.get()
    if p > cnt:
        result += -v
        cnt += 1    
    
print(result)
