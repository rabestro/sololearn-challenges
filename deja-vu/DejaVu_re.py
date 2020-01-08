string = input()

import re

if re.search(r"(.).*\1", string) == None:
    print('Unique')
else:
    print('Deja Vu')
