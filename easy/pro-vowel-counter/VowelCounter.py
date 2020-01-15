import re
sentence = input()
vowels = len(re.sub('[^AEIOUaeiou]', '', sentence))
print(vowels)
