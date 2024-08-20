import heapq
import sys

input = sys.stdin.readline



heap = []
result = []

limit = int(input().strip())

for _ in range(limit):
    x = int(input().strip())

    if x == 0:
        if heap:
            result.append(str(heapq.heappop(heap)))
        else:
            result.append("0")
    else:
        heapq.heappush(heap, x)

sys.stdout.write("\n".join(result) + "\n")