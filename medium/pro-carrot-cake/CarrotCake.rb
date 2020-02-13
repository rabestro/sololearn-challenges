CAKE = 7
carrots = gets.chomp.to_i
boxes = gets.chomp.to_i

left_over = carrots % boxes

if left_over < CAKE
    need_more = CAKE - left_over
    puts 'I need to buy %d more' % need_more
else
    puts 'Cake Time'
end
