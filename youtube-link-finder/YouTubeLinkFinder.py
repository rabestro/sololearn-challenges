import re
url = input()
id = re.search(r'[^=/]*$', url).group()
print(id)
