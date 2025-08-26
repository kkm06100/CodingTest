value = list()

N = int(input())

value.append(int(input()))

for i in range(1, N):
    values: list[int] = []
    temp = input().split()

    for v in value:
        values.append(v)
    value.clear()
    for j in range(len(temp)):
        if j >= i:
            value.append(int(temp[j])+int(values[j-1]))
        elif j > 0:
            value.append(max(int(temp[j]) + int(values[j]), int(temp[j]) + int(values[j-1])))
        else:
            value.append(int(temp[j])+int(values[j]))

print(max(value))