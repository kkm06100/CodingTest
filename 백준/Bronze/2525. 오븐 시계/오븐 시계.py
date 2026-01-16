start_hour, start_min = map(int, input().split())
during_min = int(input())

print((start_hour + int((during_min + start_min)/60)) % 24, (during_min + start_min)%60)