import sys
input = sys.stdin.readline

n = int(input())

coordinates = list(map(int, input().split()))
sorted_c = sorted(set(coordinates))

coord_map = {v: i for i, v in enumerate(sorted_c)}

print(' '.join(str(coord_map[c]) for c in coordinates))