N = int(input())
cnt = 0

for i in range(0, N):
    visited = list()
    str = input()
    flag = True
    ex = "A"
    for char in str:
        if char != ex and visited.__contains__(char):
            flag = False
            break
        visited.append(char)
        ex = char
    if flag:
        cnt += 1

print(cnt)