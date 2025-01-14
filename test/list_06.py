a, b = map(int, input().split())

box = [0] * a
for i in range(a):
      box[i] = i + 1
     

for _ in range(b):
    c, d = map(int, input().split())
    
    box[c-1],box[d-1] = box[d-1], box[c-1]
    
    

for i in range(a):
    print(box[i], end=' ')
print()