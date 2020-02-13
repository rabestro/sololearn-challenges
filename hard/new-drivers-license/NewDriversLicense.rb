hero = gets.chomp
agents = gets.chomp.to_i
persons = gets.chomp.split

position = persons.reduce(0) {|pos, name| pos += name < hero ? 1:0}

time = 20 * (1 + position / agents)
puts time
