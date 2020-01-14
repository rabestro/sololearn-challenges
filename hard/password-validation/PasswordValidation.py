password = input()

length = len(password)
symbols = 0
numbers = 0

if length > 6:
    i = length
    while i > 0:
        i -= 1
        if password[i].isdigit():
            numbers += 1
        elif password[i] in "!@#$%&*":
            symbols += 1

if length > 6 and numbers > 1 and symbols > 1:
    print("Strong")
else:
    print("Weak")
