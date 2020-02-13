snack_points = {Lettuce: 5, Carrot: 4, Mango: 9, Cheeseburger: 0}

totalSum = gets.split.map {|item| snack_points[item.to_sym]}.inject(:+)

print totalSum >= 10 ? 'Come on Down!' : 'Time to wait'
