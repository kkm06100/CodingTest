w, h = [-1, -1]
flag = True
while True:

    w, h = map(int, input().split())

    if w == 0 and h == 0:
        flag = False
        break
    space = [[0 for _ in range(w)] for _ in range(h)]
    visited = [[0 for _ in range(w)] for _ in range(h)]
    for i in range(h):
        space[i] = list(map(int, input().split()))
    task = []

    island = 0

    for i in range(h):
        for j in range(w):
            if space[i][j] == 1 and visited[i][j] == 0:
                visited[i][j] = 1
                island += 1
                if i < h - 1 and space[i + 1][j] == 1 and visited[i + 1][j] == 0:
                    task.append([i+1, j])
                if j < w - 1 and space[i][j + 1] == 1 and visited[i][j + 1] == 0:
                    task.append([i, j+1])
                if j > 0 and space[i][j - 1] == 1 and visited[i][j - 1] == 0:
                    task.append([i, j-1])
                if i > 0 and space[i - 1][j] == 1 and visited[i - 1][j] == 0:
                    task.append([i-1, j])

                if i < h - 1 and j < w - 1 and space[i + 1][j + 1] == 1 and visited[i + 1][j + 1] == 0:
                    task.append([i + 1, j + 1])
                if j < w - 1 and i > 0 and space[i - 1][j + 1] == 1 and visited[i - 1][j + 1] == 0:
                    task.append([i - 1, j + 1])
                if j > 0 and i < h - 1 and space[i + 1][j - 1] == 1 and visited[i + 1][j - 1] == 0:
                    task.append([i + 1, j - 1])
                if i > 0 and j > 0 and space[i - 1][j - 1] == 1 and visited[i - 1][j - 1] == 0:
                    task.append([i - 1, j - 1])


                while task:
                    now_task = task.pop()
                    i1 = now_task[0]
                    ji = now_task[1]
                    visited[i1][ji] = 1

                    if i1 < h - 1 and space[i1 + 1][ji] == 1 and visited[i1 + 1][ji] == 0:
                        task.append([i1 + 1, ji])
                    if ji < w - 1 and space[i1][ji + 1] == 1 and visited[i1][ji + 1] == 0:
                        task.append([i1, ji + 1])
                    if ji > 0 and space[i1][ji - 1] == 1 and visited[i1][ji - 1] == 0:
                        task.append([i1, ji - 1])
                    if i1 > 0 and space[i1 - 1][ji] == 1 and visited[i1 - 1][ji] == 0:
                        task.append([i1 - 1, ji])

                    if i1 < h - 1 and ji < w - 1 and space[i1 + 1][ji + 1] == 1 and visited[i1 + 1][ji + 1] == 0:
                        task.append([i1 + 1, ji + 1])
                    if ji < w - 1 and i1 > 0 and space[i1 - 1][ji + 1] == 1 and visited[i1 - 1][ji + 1] == 0:
                        task.append([i1 - 1, ji + 1])
                    if ji > 0 and i1 < h - 1 and space[i1 + 1][ji - 1] == 1 and visited[i1 + 1][ji - 1] == 0:
                        task.append([i1 + 1, ji - 1])
                    if i1 > 0 and ji > 0 and space[i1 - 1][ji - 1] == 1 and visited[i1 - 1][ji - 1] == 0:
                        task.append([i1 - 1, ji - 1])
    print(island if flag else "")


