s = input()
s_list = list(map(int, s))

if sum(s_list)%3 != 0 or not s_list.__contains__(0):
    print("-1")

else:
    print("".join(list(map(str, sorted(s_list, reverse=True)))))