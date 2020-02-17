puts gets.split(' ').map(&:to_i).select(&:even?).join(' ')
