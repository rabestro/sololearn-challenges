number = int(input())

if any(number % int(i) for i in input().split()):
    print('not divisible by all')
else:
    print('divisible by all')
