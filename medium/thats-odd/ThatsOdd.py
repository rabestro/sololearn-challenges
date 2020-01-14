count = int(input())
summa = 0
while count > 0:
    count -= 1
    number = int(input())
    if number % 2 == 0:
        summa += number

print(summa)
