floor = input()

import re
safe = re.search("[$T].*G.*[$T]", floor)

if safe == None:
   print('ALARM')
else:
   print('quiet')
