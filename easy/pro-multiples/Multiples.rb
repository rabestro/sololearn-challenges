n = gets.to_i

result = (0...n).filter {|i| i % 3 == 0 || i % 5 == 0}.reduce(0) { |sum, i| sum += i}

print(result)
