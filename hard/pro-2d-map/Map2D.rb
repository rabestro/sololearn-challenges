SIZE = 5 + 1 # Size of square + comma

map = gets
indexA = map.index('P')
indexB = map.index('P', indexA + 1)
       
path = indexB / SIZE - indexA / SIZE + (indexA % SIZE - indexB % SIZE).abs
puts path
