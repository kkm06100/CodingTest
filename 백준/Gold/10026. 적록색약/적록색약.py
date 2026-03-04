n = int(input())

space = [['' for _ in range(n)]for _ in range(n)]
visited = [[0 for _ in range(n)]for _ in range(n)]

for i in range(n):
    space[i] = list(input())

task = []
changes = [[0, 1], [1,0], [0,-1], [-1,0]]
area = 0

for i in range(n):
    for j in range(n):
        if visited[i][j] == 0:
            visited[i][j] = 1
            area+=1
            for c in changes:
                if 0 <= i+c[0] < n and 0 <= j + c[1] < n and visited[i + c[0]][j + c[1]] == 0 and space[i + c[0]][j + c[1]] == space[i][j]:
                    task.append((i + c[0], j + c[1], space[i][j]))

            while task:
                n_task = task.pop()
                ni, nj, now_color = [n_task[0], n_task[1], n_task[2]]
                visited[ni][nj] = 1
                for c in changes:
                    if 0 <= ni + c[0] < n and 0 <= nj + c[1]< n and visited[ni + c[0]][nj + c[1]] == 0 and space[ni + c[0]][nj + c[1]] == now_color:
                        task.append((ni + c[0], nj + c[1], space[ni + c[0]][nj + c[1]]))
print(area, end=' ')

rg_space = list(map(lambda x: list(map(lambda y: 'G' if y == 'R' else y, x)), space))
visited = [[0 for _ in range(n)]for _ in range(n)]


area = 0
for i in range(n):
    for j in range(n):
        if visited[i][j] == 0:
            visited[i][j] = 1
            area+=1
            for c in changes:
                if 0 <= i+c[0] < n and 0 <= j + c[1] < n and visited[i + c[0]][j + c[1]] == 0 and rg_space[i + c[0]][j + c[1]] == rg_space[i][j]:
                    task.append((i + c[0], j + c[1], rg_space[i][j]))

            while task:
                n_task = task.pop()
                ni, nj, now_color = [n_task[0], n_task[1], n_task[2]]
                visited[ni][nj] = 1
                for c in changes:
                    if 0 <= ni + c[0] < n and 0 <= nj + c[1]< n and visited[ni + c[0]][nj + c[1]] == 0 and rg_space[ni + c[0]][nj + c[1]] == now_color:
                        task.append((ni + c[0], nj + c[1], rg_space[ni + c[0]][nj + c[1]]))
print(area)
