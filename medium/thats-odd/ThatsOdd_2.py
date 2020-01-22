n = int(input())
no = 'not ' if any(n % int(i) for i in input().split()) else ''
print(no + 'divisible by all')
