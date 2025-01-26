from collections import defaultdict

item = []

num = int(input())

for i in range(num):
    a = int(input())   
    category_count = defaultdict(int)

    for _ in range(a):
        _, category = input().split()
        category_count[category] += 1

    
    result = 1
    for count in category_count.values():
        result *= count + 1
    
    result -= 1 # 아무것도 안 입는 경우 제외

    print(result)