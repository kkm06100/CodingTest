import re

expression = input()
numbers = expression.replace("-", "+").split("+")
signs = re.sub(r"[0-9]", " ", expression).split()

totalSum = int(numbers[0])

i = 0
while i < len(signs):
    if signs[i] == "-":
        summary = int(numbers[i+1])
        for j in range(i + 1, len(signs)):
            if signs[j] == "+":
                summary += int(numbers[j+1])
                j += 1
                i += 1
            else:
                break
        totalSum -= summary

    elif signs[i] == "+":
        totalSum += int(numbers[i+1])
    i += 1

print(totalSum)
