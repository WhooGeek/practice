a, b = map(int, input().split())
box = [0] * a

for _ in range(b):
    c, d, e = map(int, input().split())
    c = c-1
    box[c:d] = [e] * (d - c)

   

for i in range(a):
    print(box[i], end=' ')
print()
