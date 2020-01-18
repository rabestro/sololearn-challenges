tax = 0.07
items = [float(x) for x in input().split(',')]
total = sum(items) + tax * sum(filter(lambda x: x < 20, items))
print(f'{total:.2f}')
