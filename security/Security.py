import re
floor = input()
isSafe = re.search("[$T].*G.*[$T]", floor)

if isSafe: 
    print('quiet')
else: 
    print('ALARM')
