"""
animals = {"Grr": "Lion", "Rawr": "Tiger", "Ssss": "Snake", "Chirp": "Bird"}

noise = input().split()
print(' '.join(map(animals.get, noise)))

"""


print(input().replace("Grr","Lion").replace("Rawr","Tiger").replace("Chirp","Bird").replace("Ssss","Snake"))
