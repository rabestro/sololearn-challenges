import re 
print(len(re.sub(r'^B*[HP](B*)[HP]B*$',r'\1', input())))
