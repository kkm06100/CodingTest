s = list(input())

one_cnt = 0
zero_cnt = 0

i = 0

all_same = True
while i < len(s):
    if s[i] == '0':
        zero_cnt += 1
        if i != 0:
            all_same = False

        while True:
            if i+1 < len(s) and s[i+1] == '0':
                i+=1
            else:
                break
    else:
        one_cnt += 1
        if i != 0:
            all_same = False
            
        while True:
            if i+1 < len(s) and s[i+1] == '1':
                i+=1
            else:
                break

    i+=1
            
print(max(one_cnt, zero_cnt) if min(one_cnt, zero_cnt) == 0 and not all_same else min(one_cnt, zero_cnt))