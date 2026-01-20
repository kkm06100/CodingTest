import math

t = int(input())

for _ in range(t):
    x, y = map(int, input().split())

    distance = y - x

    n = int(math.sqrt(distance))

    if distance <= n * n: 
        print(2 * n - 1)

    elif distance <= n * n + n: 
        print(2 * n)

    else:
        print(2 * n + 1)