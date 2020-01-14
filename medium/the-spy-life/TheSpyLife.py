message = input()

for c in message[::-1]:
    if c.isalpha() or c.isspace(): 
        print(c, end='')
