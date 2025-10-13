N = int(input())

number = 666

roof = 0
while True:
    sixCount = 0
    for c in str(number):
        if c == '6':
            sixCount += 1
            if sixCount >= 3:
                roof += 1
                break
        else:
            sixCount = 0

    if roof == N:
        break

    number += 1

print(number)