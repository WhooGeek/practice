import sys

a = int(input())
for i in range(1, a+1, 1):
    b, c = map(int, sys.stdin.readline().split()) # 입력받는 함수로 input과 같은 기능이지만 한줄식 읽어서 대용량 데이터를 빠르게 읽을 수 있음
    print(b+c)


