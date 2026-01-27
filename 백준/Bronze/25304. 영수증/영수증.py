price = int(input())
test = int(input())

summary = 0
for i in range(test):
    p, n = map(int, input().split())
    summary += p * n

print("Yes" if price == summary else "No")