menu = {'Nachos': 6, 'Pizza': 6, 'Cheeseburger': 10, 'Water': 4, 'Coke': 5}
tax = 1.07

items = input().split()
total_cost = 0

for item in items:
    if item not in menu:
        total_cost += menu['Coke']
    else:
        total_cost += menu[item]

total_cost *= tax

print('%.2f' % total_cost)
