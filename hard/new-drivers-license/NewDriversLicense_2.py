hero = input()
agents = int(input())
persons = input().split()
	
position = len(list(filter(lambda n: n < hero, persons)))
time = 20 * (1 + position // agents)

print(time)
