import re
group = input()
hero = input()
isSame = re.search(r'^(.).*\b.*\b\1', hero + ' ' + group)

if isSame:
    print('Compare notes')
else:
    print('No such luck')
