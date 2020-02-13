animals = {"Grr": "Lion", "Rawr": "Tiger", "Ssss": "Snake", "Chirp": "Bird"}

noise = input().split()
print(' '.join(map(animals.get, noise)))
