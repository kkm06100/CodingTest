n, lhs, kjm = map(int, input().split())

cnt = 0
while (lhs+1)//2 != (kjm+1)//2:
    cnt += 1
    kjm = (kjm+1)//2
    lhs = (lhs+1)//2

print(cnt+1)