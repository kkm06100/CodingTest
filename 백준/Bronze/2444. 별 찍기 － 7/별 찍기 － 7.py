n = int(input())

star_cnt = n
stars = ""
for i in range(n):
    for j in range(star_cnt - 1):
        stars += " "
    for j in range((n - star_cnt) * 2 + 1):
        stars += "*"
    stars += "\n"
    star_cnt -= 1

star_cnt += 2

for i in range(n):
    for j in range(star_cnt - 1):
        stars += " "
    for j in range((n - star_cnt) * 2 + 1):
        stars += "*"
    stars += "\n"
    star_cnt += 1

print(stars)