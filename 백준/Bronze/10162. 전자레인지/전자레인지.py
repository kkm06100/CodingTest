t = int(input())

if t%10 != 0:
    print('-1')
else:
    print(int(t/300), end=' ')
    print(int(t%300/60), end=' ')
    print(int(t%60/10))