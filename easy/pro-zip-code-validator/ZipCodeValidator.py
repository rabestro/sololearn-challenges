import re
zip_code = input()

is_valid = re.search(r'^\d{5}$', zip_code) is not None

if is_valid:
    print('true')
else:
    print('false')
