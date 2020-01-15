rate = 1.1
limit_usd = 20
items = [float(i) for i in input().split()]

if any(item * rate > limit_usd for item in items):
    print('Back to the store')
else:
    print('On to the terminal')
