dice = sorted(list(map(int, input().split())))

prize = lambda d: (
    10000 + d[0] * 1000 if d[0] == d[2]
    else 1000 + d[1] * 100 if d[0] == d[1] or d[1] == d[2]
    else d[2] * 100
)

print(prize(dice))