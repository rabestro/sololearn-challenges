phrase = input().split()
output = ''
numbers = 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten'

for word in phrase:
    if word.isdigit() and int(word) in range(11):
        output += numbers[int(word)] + ' '
    else:
        output += word + ' '
        
print(output)
