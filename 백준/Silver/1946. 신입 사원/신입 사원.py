import sys

input = sys.stdin.readline

t = int(input())

output = ""
for i in range(t):
    n = int(input())
    employee = {}
    count = 0
    for i in range(n):
        t1, t2 = map(int, input().split())
        employee[t1] = t2
    s_employee = sorted(employee.items(), key=lambda x: x[0])

    min_t2 = 9000000
    for e in s_employee:
        if e[1] < min_t2:
            count += 1
            min_t2 = e[1]

    output += str(count)+"\n"

print(output)