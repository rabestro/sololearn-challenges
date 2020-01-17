def isValid(n):
    if len(n) != 16:
        return False
    r = [int(ch) for ch in n][::-1]
    return (sum(r[0::2]) + sum(sum(divmod(d*2,10)) for d in r[1::2])) % 10 == 0
	
number = input()

if isValid(number):
    print('valid')
else:
    print('not valid')
