a = int(input())
b = int(input())
c = int(input())

result = str(a * b * c)
print('\n'.join(str(result.count(str(i))) for i in range(10)))