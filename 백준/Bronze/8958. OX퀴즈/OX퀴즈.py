t_case = int(input())


for i in range(t_case):
    total_cnt = 0
    o_cnt = 0
    test = input()
    for j in range(len(test)):
        if test[j] == 'O':
            o_cnt += 1
            total_cnt += o_cnt
        else :
            o_cnt = 0

    print(total_cnt)
