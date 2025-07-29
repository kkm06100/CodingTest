from collections import deque


class Value:
    def __init__(self, x, y):
        self.x = x
        self.y = y


start = input().split(" ")

N = int(start[0])

maze = [[0 for i in range(N)] for j in range(N)]

for i in range(0, N):
    line = input()
    for j in range(0, N):
        maze[i][j] = int(line[j])

visited = [[0 for i in range(N)] for j in range(N)]
queue = deque()

allEstateCount = 0
flag = False
estate = deque()

estateCount = 0


def findOne():
    global allEstateCount
    global flag
    for i in range(0, N):
        for j in range(0, N):
            if maze[i][j] == 1 and visited[i][j] == 0:
                queue.append(Value(j, i))
                allEstateCount += 1
                return
    flag = True


def bfs(value: Value):
    global allEstateCount
    global estateCount
    x = value.x
    y = value.y

    visited[y][x] = 1
    estateCount += 1

    if x > 0 and maze[y][x - 1] == 1 and visited[y][x - 1] == 0:
        visited[y][x - 1] = 1
        queue.append(Value(x - 1, y))
    if y > 0 and maze[y - 1][x] == 1 and visited[y - 1][x] == 0:
        visited[y - 1][x] = 1
        queue.append(Value(x, y - 1))
    if x < N - 1 and maze[y][x + 1] == 1 and visited[y][x + 1] == 0:
        visited[y][x + 1] = 1
        queue.append(Value(x + 1, y))
    if y < N - 1 and maze[y + 1][x] == 1 and visited[y + 1][x] == 0:
        visited[y + 1][x] = 1
        queue.append(Value(x, y + 1))


while not flag:
    if not queue:
        if estateCount != 0:
            estate.append(estateCount)
            estateCount = 0
        findOne()
    else:
        bfs(queue.popleft())

print(allEstateCount)


estate = sorted(list(estate))
for count in estate:
    print(count)
