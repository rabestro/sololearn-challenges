sales = gets.chomp.to_i

income = sales * 3;

if income > 21
  print("Profit")
elsif income < 21
  print("Loss")
else
  print("Broke Even")
end
