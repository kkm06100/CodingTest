numbers = input().split()
N = int(numbers[0])
M = int(numbers[1])

def factorial(arr: list):
    if len(arr) == M:
        for value in arr:
            print(value, end=' ')
        print()
        return

    for i in range(1, N+1):
        if not arr.__contains__(i):
            factorial(arr + [i])


for i in range(1, N+1):
    factorial(arr=[i])