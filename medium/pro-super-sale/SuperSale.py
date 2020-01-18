from math import floor

tax = 1 + 0.07 
discount = 1 - 0.3 

items = sorted([float(x) for x in input().split(',')])

full_price = sum(items)
sale_price = sum(items[-1:]) + discount * sum(items[:-1])

savings = floor((full_price - sale_price) * tax)

print(savings)
