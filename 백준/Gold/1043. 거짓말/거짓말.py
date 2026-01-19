n, m = map(int, input().split())

true_count, *true_p = map(int, input().split())

set_true_p = set(list(true_p))
cnt = 0
p_list = []
changed = True

for i in range(m):
    p_count, *p = map(int, input().split())
    p_list.append(p)

while changed:
    changed = False
    for p in p_list:
        if any(x in set_true_p for x in p):
            before_size = len(set_true_p)
            set_true_p.update(p)
            if len(set_true_p) > before_size:
                changed = True

for p in p_list:
    if not any(x in set_true_p for x in p):
        cnt += 1

print(cnt)