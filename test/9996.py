count = int(input())
format = input()

start, end = format.split('*')

box = [input() for _ in range(count)]

for i in box:
    if i.startswith(start) and i.endswith(end) and len(i) >= len(start) + len(end):
        print("DA")
    else: 
        print("NE")