message = input()

for c in message.lower():
    if c.isalpha(): 
        print(chr(ord('a') + ord('z') - ord(c)), end='')
    else:
        print(c, end='')
