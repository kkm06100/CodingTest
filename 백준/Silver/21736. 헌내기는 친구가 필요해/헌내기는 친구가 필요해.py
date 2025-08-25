from collections import deque

class Node:
    def __init__(self, x, y):
        self.x = x
        self.y = y

size = input().split()

N = int(size[0])
M = int(size[1])

campus = [[0] * M for _ in range(N)]
startLocation = None

for i in range(N):
    line = input()
    for j in range(len(line)):
        campus[i][j] = line[j]
        if line[j] == "I":
            startLocation = Node(i, j)

visited = [[False] * M for _ in range(N)]
queue = deque()

queue.append(startLocation)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

count = 0

visited[startLocation.x][startLocation.y] = True
while queue:
    node = queue.popleft()
    if campus[node.x][node.y] == "P":
        count += 1

    for i in range(4):
        nx = node.x + dx[i]
        ny = node.y + dy[i]
        if 0 <= nx < N and 0 <= ny < M and campus[nx][ny] != "X" and visited[nx][ny] is False:
            visited[nx][ny] = True
            queue.append(Node(nx, ny))

print(count if count != 0 else "TT")