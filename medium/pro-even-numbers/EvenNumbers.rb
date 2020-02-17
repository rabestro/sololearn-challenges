puts gets.split(' ').map(&:to_i).select { |i| i % 2 == 0 }.join(' ')
