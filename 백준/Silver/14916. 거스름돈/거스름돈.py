m = int(input())

if m == 1 or m == 3:
    print(-1)
elif m%5%2 == 1:
    if ((m-5)%5+5)%2 == 0:
        print(int((m-5)/5) + int((m%5+5)/2))
    else:
        print(-1)
else:
    print(int(m/5) + int(m%5/2))