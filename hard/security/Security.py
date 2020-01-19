import re
floor = input()
alarm = re.search("[$T].*G.*[$T]", floor) is None
print(('quiet','ALARM')[alarm])
