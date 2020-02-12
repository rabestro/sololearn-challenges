aWidth, aLength = gets.chomp.split(",")
bWidth, bLength = gets.chomp.split(",")

if (aWidth.to_i * aLength.to_i) > (bWidth.to_i * bLength.to_i)
    print("Apartment A")
else
    print("Apartment B")
end
