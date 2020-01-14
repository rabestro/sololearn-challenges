import math

height = int(input())
width = int(input())
rollSquare = 10 # 60ft long * 2" / 12" width
doorSquare = 2 * height * width # Both sides of the door!

rollsRequired = math.ceil(doorSquare / rollSquare)
print(rollsRequired)
