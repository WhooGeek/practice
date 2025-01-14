a, b = map(int, input().split())

arr = list(map(int, input().split()))

result = []

countDict = {}

for num in arr:
    if num in countDict:
            countDict[num] += 1
    else:
            countDict[num] = 1
    
sortedresult = sorted(countDict.items(), key = lambda item: (-item[1], arr.index(item[0])))

for num, count in sortedresult:
       result.extend([num] * count)

print(*result[:a], sep=' ')