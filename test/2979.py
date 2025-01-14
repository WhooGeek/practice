a, b, c = map(int, input().split())

first = []
second = []
third = []

parking = [0] * 101

for _ in range(3):
    d, e = map(int, input().split())
    for i in range(d, e):
        parking[i] += 1


fee = 0
for i in range(len(parking)):
    if parking[i] == 1:
        fee += a
    elif parking[i] == 2:
        fee += b*2
    elif parking[i] == 3:
        fee += c*3


print(fee)


