puts Array.new(gets.to_i){gets.to_i}.select(&:even?).push(0).inject(:+)
