n = int(input())    

def find666(n):
    count = 0
    num = 666  

    while True:
        if '666' in str(num):  
            count += 1
            if count == n:  # n번째 666 포함된 숫자를 찾으면 반환
                return num
        num += 1  # 다음 숫자로 증가

print(find666(n))  