aWidth, aLength = gets.chomp.split(",")
bWidth, bLength = gets.chomp.split(",")

isBiggerA = aWidth.to_i * aLength.to_i > bWidth.to_i * bLength.to_i

puts "Apartment " + (isBiggerA ? "A": "B")
