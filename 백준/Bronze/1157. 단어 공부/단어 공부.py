string = str(input()).upper()

chars = {}

for char in string:
    if char in chars:
        chars[char] += 1
    else :
        chars.setdefault(char, 1)

sorted_chars = sorted(chars.items(), key=lambda c: c[1])

print(sorted_chars.pop()[0] if len(sorted_chars) == 1 or sorted_chars[-1][1] != sorted_chars[-2][1] else "?")