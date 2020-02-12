height = gets.chomp.to_i
width = gets.chomp.to_i

rollSquare = 10 # 60ft long * 2" / 12" width
doorSquare = 2.0 * height * width # Both sides of the door!

rollsRequired = (doorSquare / rollSquare).ceil
puts rollsRequired
