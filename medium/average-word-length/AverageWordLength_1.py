from math import ceil
essay = input().split()
characters = 0
for word in essay:
    for symbol in word:
        if symbol.isalpha(): 
            characters += 1

average = int(ceil(characters / len(essay)))
print(average)
