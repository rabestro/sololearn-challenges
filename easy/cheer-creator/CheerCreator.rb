yards = gets.chomp.to_i

if yards > 10
  puts "High Five"
elsif yards < 1
  puts "shh"
else
  puts "Ra!" * yards
end
