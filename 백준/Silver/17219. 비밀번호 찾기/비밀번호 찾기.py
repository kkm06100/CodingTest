numbers = input().split(" ")
N = int(numbers[0])
M = int(numbers[1])

sites = dict()
for i in range(N):
    info = input().split(" ")
    site = info[0]
    password = info[1]
    sites[site] = password

for i in range(M):
    site = input()
    print(sites[site])