SIZE = 5 + 1 # Size of square + comma

map = input()
indexA = map.index('P')
indexB = map.index('P', indexA + 1)
       
path = indexB // SIZE - indexA // SIZE + abs(indexA % SIZE - indexB % SIZE)
        
print(path)
