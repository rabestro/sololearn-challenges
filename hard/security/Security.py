import re
floor = "".join(re.findall(r'[G$T]', 'xxxxxGxTx$xGxxT'))
if re.search(r'(\$T)|(T\$)', floor):
    print('ALARM')
else:
    print('quiet')

