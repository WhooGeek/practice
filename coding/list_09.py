a, b = map(int, input().split())

box = [0]*a

for i in range(a):
    box[i] = i + 1
    

for i in range(b):
    c, d = map(int, input().split())

    box[c-1:d] = box[c-1:d][::-1]
    
    
    

for i in range(a):
    print(box[i], end=' ')
print()