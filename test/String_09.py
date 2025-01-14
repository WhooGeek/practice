a, b = map(int, input().split())

reA = str(a)[::-1]
reB = str(b)[::-1]

if int(reA) > int(reB):
    print(reA)
else:
    print(reB)