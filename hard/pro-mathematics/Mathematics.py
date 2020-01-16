import re

def calculate(s):
    
    calc = {'+': lambda x,y: x + y, 
            '-': lambda x,y: x - y, 
            '*': lambda x,y: x * y, 
            '/': lambda x,y: x // y}
        
    EXPR = r'(.*?)(\d+)([%s])(\d+)(.*)'
    e = re.search(EXPR % '*/', s) or re.search(EXPR % '-+', s)
	
    if e:
        before = e.group(1)
        x = e.group(2)
        op = e.group(3)
        y = e.group(4)
        after = e.group(5)
        result = before + str(calc[op](int(x), int(y))) + after
        return calculate(result)
    else:
        return int(s)
	

number = int(input())
expressions = [s[1:-1] for s in input().split()]

index = 0
for expression in expressions:
    if number == calculate(expression): 
        break
    index += 1
    
if index == len(expressions):
    print ('none')
else:
    print ('index %d' % index)
