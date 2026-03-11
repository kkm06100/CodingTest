from collections import deque

m, n = map(int, input().split())

space = []
for i in range(n):
    space.append(list(map(int, input().split())))

queue = deque()

for i in range(n):
    for j in range(m):
        if space[i][j] == 1:
            queue.append([i, j, 0])

d = [[1, 0], [0, 1], [0, -1], [-1, 0]]

max_weight = 0

while queue:
    x, y, weight = queue.popleft()

    for dx, dy in d:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m and space[nx][ny] == 0:
            space[nx][ny] = 1
            queue.append([nx, ny, weight + 1])

    if not queue:
        max_weight = weight

flag = all(space[i][j] != 0 for i in range(n) for j in range(m))

print(max_weight if flag else -1)