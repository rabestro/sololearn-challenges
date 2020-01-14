import re
from math import ceil

essay = input()
words = len(essay.split())
chars = len(re.sub(r'\W+', '', essay))

average = int(ceil(chars / words))
print(average)
