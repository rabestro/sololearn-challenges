"""
#  ===None Regex Solution===
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
"""

import re

if re.fullmatch(r'^(?=.*[A-Za-z])(?=.*\d){2,}(?=.*[@$!%*#?&]){2,}[A-Za-z\d@$!%*#?&]{7,}$', input()):
    print('Strong')
else:
    print("Weak")
