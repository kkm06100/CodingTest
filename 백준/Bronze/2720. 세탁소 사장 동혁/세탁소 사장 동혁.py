t = int(input())

for i in range(t):
    money = int(input())

    print(int(money/25), end = ' ')
    print(int(money%25/10), end = ' ')
    print(int(money%25%10/5), end = ' ')
    print(int(money%5))