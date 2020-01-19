import re
word = input()

isogram = re.search(r'(.).*\1', word) is None

print('true' if isogram else 'false')
