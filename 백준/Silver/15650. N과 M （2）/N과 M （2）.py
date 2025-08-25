numbers = input().split()
N = int(numbers[0])
M = int(numbers[1])

def factorial(arr: list):
    if len(arr) == M:
        for value in arr:
            print(value, end=' ')
        print()
        return

    last_value = arr[-1]

    for i in range(last_value+1, N+1):
        factorial(arr + [i])


for i in range(1, N+1):
    factorial(arr=[i])