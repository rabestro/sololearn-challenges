menu = {Nachos: 6, Pizza: 6, Cheeseburger: 10, Water: 4, Coke: 5}
tax = 1.07

total_cost = gets.split.reduce(0) {|sum, item| sum += menu.fetch(item.to_sym, 5)}

print '%.2f' % [total_cost * tax]
