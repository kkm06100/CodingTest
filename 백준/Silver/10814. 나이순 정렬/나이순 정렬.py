N = int(input())

people = []

for _ in range(N):
    age, name = input().split()
    age = int(age)
    people.append((age, name))

people.sort(key=lambda x: x[0])

for age, name in people:
    print(age, name)
