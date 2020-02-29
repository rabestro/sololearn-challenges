n = gets.chars.map(&:to_i)
puts n.inject(:+) == n.inject(:*)
