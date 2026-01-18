n_count = int(input())

arr = sorted(list(map(int, input().split())))

n = 0
if len(arr) % 2 == 0:
    n = arr[-1] * arr[0]
else :
    n = arr[int(len(arr) / 2)]**2

print(n)