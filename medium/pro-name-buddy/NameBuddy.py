group = input()
hero = input()
isSame = any(map(lambda x: x[0:1] == hero[0:1], group))

if isSame:
    print('Compare notes')
else:
    print('No such luck')
