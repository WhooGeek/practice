a = [0] * 26
b = input()

for i in range(97, 123):
    S = chr(i)

    if S in b: # 문자가 문자열 안에 있는지 체크
        a[i-97] = b.index(S) # 인덱스로 뽑아내면 중복의 경우에도 맨 앞에서 등장하는 값만 체크가 됨
    
    else:
        a[i-97] = -1

for j in range(len(a)):
    print(a[j], end =" ")
