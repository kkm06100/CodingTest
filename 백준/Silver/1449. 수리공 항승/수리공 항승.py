n, l = map(int, input().split())

crack = map(int, input().split())

s_crack = sorted(crack)

i = 0
tape = 0
while i < len(s_crack):
    tape += 1
    j = 0
    while i + j < len(s_crack) and s_crack[i + j] - s_crack[i] < l:
        j += 1

    i += j

print(tape)