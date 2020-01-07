essay = input().split()

characters = 0
for word in essay:
    for c in word:
        if c.isalpha(): 
            characters += 1

from math import ceil
average = int(ceil(characters / len(essay)))
print(average)
