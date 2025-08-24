N = int(input())

line = 1
while N > line:
    N -= line
    line += 1

if line % 2 == 0:
    child = N
    parent = line - N + 1
else:
    child = line - N + 1
    parent = N

print(f"{child}/{parent}")
