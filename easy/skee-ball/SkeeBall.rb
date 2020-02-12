points = gets.chomp.to_i
price = gets.chomp.to_i
    
if points / 12 >= price
    puts "Buy it!"
else
    print "Try again"
end
