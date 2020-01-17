snack_points = {'Lettuce': 5, 'Carrot': 4, 'Mango': 9, 'Cheeseburger': 0}

isCome = sum([snack_points[i] for i in input().split()]) >= 10

if isCome:
    print('Come on Down!')
else:
    print('Time to wait')
