signs = Array.new(4) { gets.chomp }

puts signs.any? {|s| s == s.reverse} ? 'Open' : 'Trash'
