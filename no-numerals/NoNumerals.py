phrase = input().split()

numbers = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five',
	   6: 'six', 7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten'}
			 
output = ''
for word in phrase:
    if word.isdigit() and int(word) in numbers:
        output += numbers[int(word)] + ' '
    else:
        output += word + ' '
        
print(output)
