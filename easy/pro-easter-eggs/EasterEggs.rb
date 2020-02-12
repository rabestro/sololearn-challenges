eggs = gets.chomp.to_i
you = gets.chomp.to_i
friend = gets.chomp.to_i

if you + friend < eggs
    print('Keep Hunting')
else
    print('Candy Time')
end
