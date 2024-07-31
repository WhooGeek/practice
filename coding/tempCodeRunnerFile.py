a, b =map(int, input().split())
c = int(input())

if(a == 23 and 60-b > c):
    b = b+c
    print(a, b)
elif(a == 23 and 60-b < c):
    a = 0
    b = b + c - 60
    if(b == 60):
        a = 1
        b = 0
        print(a, b)
    else:
        print(a, b)
elif(a < 23 and 60-b>c):
    b = b+c
    print(a,b)
elif(a<23 and 60-b<c):
    a = a+1
    b = b+c-60
    if(b == 60):
        a = a+1
        b = 0
        print(a, b)
    else:
        print(a, b)
    

