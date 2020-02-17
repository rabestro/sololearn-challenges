items = gets.split(',').map(&:to_i).sort
savings = 1.07 * 0.30 * (items.inject(:+) - items[-1])
puts savings.to_i
