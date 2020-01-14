noise = input().split()

animals = {"Grr": "Lion", "Rawr": "Tiger", "Ssss": "Snake", "Chirp": "Bird"}

for sound in noise:
    print(animals[sound], end=' ')
