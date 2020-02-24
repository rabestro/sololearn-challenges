puts 0 < Array.new(gets.to_i){gets.to_i}.reduce{|a,b| a > 0 && b > a ? a + b : 0}
