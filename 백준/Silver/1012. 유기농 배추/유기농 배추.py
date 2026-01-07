T = int(input())
directions = [(1,0), (0,1), (-1,0), (0,-1)]

for _ in range(T):
    M, N, K = map(int, input().split())

    L = [[0]*M for _ in range(N)]
    visited = [[0]*M for _ in range(N)]

    for _ in range(K):
        x, y = map(int, input().split())
        L[y][x] = 1

    count = 0

    for i in range(N):
        for j in range(M):
            if L[i][j] == 1 and not visited[i][j]:
                stack = [(i, j)]
                visited[i][j] = 1
                count += 1

                while stack:
                    x, y = stack.pop()
                    for dx, dy in directions:
                        nx, ny = x + dx, y + dy
                        if 0 <= nx < N and 0 <= ny < M:
                            if L[nx][ny] == 1 and not visited[nx][ny]:
                                visited[nx][ny] = 1
                                stack.append((nx, ny))

    print(count)
