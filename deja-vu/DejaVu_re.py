import re
string = input()
isDejaVu = re.search(r"(.).*\1", string)

if isDejaVu:
    print('Deja Vu')
else:
    print('Unique')
