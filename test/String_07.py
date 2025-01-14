a = int(input())

numbers = []
tests = []

for i in range(a):
    b = input().split()


    for item in b:
        if item.isdigit(): # 숫자 필터링
            number = int(item)
        else:
            test = item
    
    numbers.append(number)
    tests.append(test)

for i in range(a):
    for j in range(len(tests[i])):
        
        print(tests[i][j] * numbers[i], end ="")
    print()

