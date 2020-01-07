animals = {"Grr": "Lion", "Rawr": "Tiger", "Ssss": "Snake", "Chirp": "Bird"}

noise = input().split()
output = ""

for sound in noise:
    output += animals[sound] + " "
    
print(output)
