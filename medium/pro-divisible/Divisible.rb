number = gets.to_i
puts gets.split(' ').map(&:to_i).any?{|x| number % x > 0} ? 'not divisible by all' : 'divisible by all'
