N, M = input().strip().split()
N, M = int(N), int(M)

board = [list(input().strip()) for _ in range(N)]

minFix = 100

for i in range(N-7):
    for j in range(M-7):
        fix = 0
        nowColor = 'W'
        fix_w = 0
        fix_b = 0

        for x in range(8):
            for y in range(8):
                expected_w = 'W' if (x + y) % 2 == 0 else 'B'
                expected_b = 'B' if (x + y) % 2 == 0 else 'W'
                if board[i + x][j + y] != expected_w:
                    fix_w += 1
                if board[i + x][j + y] != expected_b:
                    fix_b += 1
        minFix = min(minFix, fix_w, fix_b)

print(minFix)