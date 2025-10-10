A, B = map(int, input().split())

flag = False
totalCount = -1


def dfs(now, count):
    global flag
    global totalCount

    if flag:
        return
    if now * 2 <= B:
        dfs(now * 2, count + 1)
    if now * 10 + 1 <= B:
        dfs(now * 10 + 1, count + 1)
    if now == B:
        totalCount = count
        flag = True
        return


dfs(A, 1)

print(totalCount)
