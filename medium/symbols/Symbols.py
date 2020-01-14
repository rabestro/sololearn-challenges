text = input()

for c in text:
    if c.isalnum() or c.isspace():
        print(c, end='')
