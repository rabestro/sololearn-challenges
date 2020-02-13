tax = 1.07
menu = {Nachos: 6, Pizza: 6, Cheeseburger: 10, Water: 4, Coke: 5}
menu.default = menu[:Coke]

total_cost = gets.split.map {|i| menu[i.to_sym]}.inject(:+)

puts '%.2f' % [total_cost * tax]
