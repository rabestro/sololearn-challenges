import re
usTime = re.search(r'(\d?\d):(\d\d) (A|P)M', input())

hours = int(usTime.group(1))
minutes = usTime.group(2)
indicator = usTime.group(3)

if indicator == 'P':
    hours += 12
elif hours == 12:
    hours = 0
   
print('%02d:%s' % (hours, minutes))
