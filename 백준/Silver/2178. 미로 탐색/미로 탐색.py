from collections import deque

class Value:
    def __init__(self, x, y, count):
        self.x = x
        self.y = y
        self.count = count
start = input().split(" ")

N = int(start[0])
M = int(start[1])

maze = [[0 for i in range(M)] for j in range(N)]

for i in range(0, N):
    line = input()
    for j in range(0, M):
        maze[i][j] = int(line[j])

visited = [[0 for i in range(M)] for j in range(N)]
queue = deque()

queue.append(Value(0, 0, 0))

flag = False

def bfs(x, y, count):
    global flag
    if x == N - 1 and y == M - 1:
        flag = True
        print(count + 1)
        return 0

    elif visited[x][y] == 0 and maze[x][y] == 1:
        if not(x < 1):
            queue.append(Value(x - 1, y, count + 1))
        if not(y < 1):
            queue.append(Value(x, y - 1, count + 1))
        if (x < N - 1):
            queue.append(Value(x + 1, y, count + 1))
        if (y < M - 1):
            queue.append(Value(x, y + 1, count + 1))
    visited[x][y] = 1

while not flag:
    if queue:
        value = queue.popleft()
        bfs(value.x, value. y, value.count)
    else:
        break

