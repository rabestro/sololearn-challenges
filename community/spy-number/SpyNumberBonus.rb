min = gets.to_i
max = gets.to_i

for n in min..max do 
  puts n if n.digits.inject(:+) == n.digits.inject(:*)
end
