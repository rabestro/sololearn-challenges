puts Array.new(6){gets.to_i}.map{|i| i % 3 > 0 ? i % 2 > 0 ? "Snap" : "Crackle" : "Pop"}.join(' ')
