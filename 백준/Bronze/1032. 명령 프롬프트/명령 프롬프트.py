t = int(input())

files = []
for i in range(t):
    files.append(input())

text = list(files[0])

for file in files:
    for i in range(len(file)):
        if file[i] != text[i]:
            text[i] = '?'

print(''.join(text))