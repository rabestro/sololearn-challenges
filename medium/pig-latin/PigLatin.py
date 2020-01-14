sentence = input().split()
pig_latin = ""

for word in sentence:
    pig_latin += word[1:] + word[0] + "ay "

print(pig_latin)
