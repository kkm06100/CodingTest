n = int(input())

star_cnt = n
stars = ""
for i in range(n):
    for j in range(star_cnt):
        stars += "*"
    stars += "\n"
    star_cnt -= 1

print(stars)