from collections import deque

N, M = map(int, input().split())
arr = [int(input()) for _ in range(N-1)]


queue = deque(arr)

cnt = 0

while queue:
    mvalue = min(queue)

    for _ in range(M):
        if not queue:
            break

        if queue[-1] == mvalue:
            queue.pop()
            break
        else:
            queue.appendleft(queue.pop())
    
    cnt += 1
        

    
print(cnt)
