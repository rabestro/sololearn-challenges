hero = gets.chomp
agents = gets.chomp.to_i
persons = gets.chomp.split

position = persons.select{|name| name < hero}.size

time = 20 * (1 + position / agents)
puts time
