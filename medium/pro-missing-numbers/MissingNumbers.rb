data = Array.new(gets.to_i){gets.to_i}
print (data[0].upto(data[-1]).to_a - data).join(' ')
