s = int(input())

cnt = 0
if s != 1:
    for i in range(1, s):
        if s-i >= 0:
            s -= i
            cnt += 1
        else:
            break
    print(cnt)
else:
    print(1)
