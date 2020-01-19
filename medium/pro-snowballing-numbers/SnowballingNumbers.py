numbers = [int(input()) for i in range(int(input()))]

sum = 0
for n in numbers:
    if n <= sum:
        print('false')
        break
    sum += n
else:
    print('true')
