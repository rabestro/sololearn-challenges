import re

string = input()

isUnique = re.search(r"(.).*\1", string) == None

if isUnique:
    print('Unique')
else:
    print('Deja Vu')
