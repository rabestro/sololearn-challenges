import re
password = input()
isStrong = len(password) > 6 \
           and re.search(r'\d.*\d', password) \
           and re.search(r'([!@#$%&*].*){2,}', password)

if isStrong:
    print("Strong")
else:
    print("Weak")
