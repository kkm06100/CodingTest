X = int(input())
sticks = [64]

while sum(sticks) > X:
    smallest = min(sticks)
    sticks.remove(smallest)
    sticks.append(smallest / 2)

    if sum(sticks) < X:
        sticks.append(smallest / 2)

print(len(sticks))