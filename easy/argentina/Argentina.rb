pesos = gets.chomp.to_i
dollars = gets.chomp.to_i

if dollars * 50 > pesos
	puts "Pesos"
else
	puts "Dollars"
end
