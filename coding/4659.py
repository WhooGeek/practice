lst = ['a', 'i', 'e', 'o', 'u']
twice = ["ee", "oo"]

while True:
    arr = input()

    if arr == 'end':
        break

    cnt = 0
    x = 0
    y = 0
    for i in lst :
        if i in arr:
            cnt += 1
    
    if cnt < 1:
        print(f'<{arr}> is not acceptable.')
        continue
    
    for i in range(len(arr)-2):
        if arr[i] in lst and arr[i+1] in lst and arr[i+2] in lst:
            x = 1
            break
        elif not(arr[i] in lst) and not(arr[i+1] in lst) and not(arr[i+2] in lst):
            x = 1
            break
    
    if x == 1:
        print(f'<{arr}> is not acceptable.')
        continue
  

    
    for i in range(len(arr) - 1):
        if arr[i] == arr[i+1]:
            if arr[i] == 'e' or arr[i] == 'o':
                continue
            else:
                y = 1
                break
    if y == 1:
        print(f'<{arr}> is not acceptable.')
        continue
    else:
        print(f'<{arr}> is acceptable.')
    
                
    