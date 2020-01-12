import re
months = {'January': 1, 'February': 2, 'March': 3, 'April': 4, 'May': 5, 'June': 6,
          'July': 7, 'August': 8, 'September': 9, 'October': 10, 'November': 11, 'December': 12}

usDate = re.search(r'(.*)[ /](\d{1,2})[,/] ?(\d{4})', input())

month = usDate.group(1)
day = usDate.group(2)
year = usDate.group(3)

if len(month) > 2:
    month = months.get(month)

print('{}/{}/{}'.format(day, month, year))
