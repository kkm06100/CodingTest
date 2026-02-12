m = 1000 - int(input())

print(int(m/500) + int(m%500/100) + int(m%100/50) + int(m%50/10) + int(m%10/5) + int(m%5))