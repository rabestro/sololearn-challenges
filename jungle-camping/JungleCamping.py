animals = ["Lion", "Tiger", "Snake", "Bird"]
sounds = ["Grr", "Rawr", "Ssss", "Chirp"]
   
noise = input().split()
output = ""

for sound in noise:
    output += animals[sounds.index(sound)] + " "

print(output)
