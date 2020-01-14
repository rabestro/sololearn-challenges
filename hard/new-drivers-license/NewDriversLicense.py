name = input()
agents = int(input())
persons = input().split()

position = 0

for person in persons:
    if person < name:
        position += 1
        
time = 20 * (1 + position // agents)
print(time)
