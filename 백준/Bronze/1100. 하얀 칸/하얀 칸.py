chess_board = []

for i in range(8):
    chess_board.append(input())
cnt = 0
white = True
for chess_line in chess_board:
    for c in chess_line:
        if white and c == 'F':
            cnt += 1
        white = not white
    white = not white
print(cnt)