from collections import Counter

s = input()
counter = Counter(s)

odd_chars = [c for c, cnt in counter.items() if cnt % 2 == 1]

if len(odd_chars) > 1:
    print("I'm Sorry Hansoo")
else:
    half = []
    for c, cnt in sorted(counter.items()):
        half.extend([c] * (cnt // 2))

    mid = odd_chars[0] if odd_chars else ''
    result = ''.join(half) + mid + ''.join(reversed(half))
    print(result)