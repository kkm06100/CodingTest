from collections import defaultdict

T = int(input())
for i in range(T):
    clothes = defaultdict(int)
    N = int(input())
    for j in range(N):
        cloth = input().split()
        clothes[cloth[1]] = clothes[cloth[1]] + 1

    clothesList = list(clothes.values())
    sum = 1
    for j in range(len(clothesList)):
        sum *= clothesList[j] + 1

    print(sum-1)