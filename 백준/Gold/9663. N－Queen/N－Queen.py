N = int(input())
count = 0

col = [False] * N
diag1 = [False] * (2 * N)
diag2 = [False] * (2 * N)
def backtrack(row):
    global count
    if row == N:
        count += 1
        return
    for c in range(N):
        if not col[c] and not diag1[row + c] and not diag2[row - c + N - 1]:
            col[c] = diag1[row + c] = diag2[row - c + N - 1] = True
            backtrack(row + 1)
            col[c] = diag1[row + c] = diag2[row - c + N - 1] = False

backtrack(0)
print(count)
