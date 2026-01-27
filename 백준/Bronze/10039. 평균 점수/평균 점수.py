student = []

for i in range(5):
    student.append(int(input()))

print(int(sum(map(lambda x: 40 if 40 > x else x, student))/5))