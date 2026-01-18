a, b = map(int, input().split())

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def change_one(a):
    if str(a).count('1') == len(str(a)):
        return a
    else:
        return '1' * a

print(change_one(gcd(a, b)))