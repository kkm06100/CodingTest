MOD = 1000000007

def mat_mul(A, B):
    return [
        [(A[0][0]*B[0][0] + A[0][1]*B[1][0]) % MOD,
         (A[0][0]*B[0][1] + A[0][1]*B[1][1]) % MOD],
        [(A[1][0]*B[0][0] + A[1][1]*B[1][0]) % MOD,
         (A[1][0]*B[0][1] + A[1][1]*B[1][1]) % MOD]
    ]

def mat_pow_iter(A, n):
    result = [[1, 0], [0, 1]] 
    while n > 0:
        if n % 2 == 1:
            result = mat_mul(result, A)
        A = mat_mul(A, A)
        n //= 2
    return result

N = int(input())

if N == 0:
    print(0)
else:
    A = [[1, 1], [1, 0]]
    result = mat_pow_iter(A, N-1)
    print(result[0][0])
