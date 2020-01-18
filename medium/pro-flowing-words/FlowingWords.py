import re
isFlowing = ('false', 'true')[re.search(r'^(\S*(\S) \2\S*)*$', input()) is not None]
print(isFlowing)
