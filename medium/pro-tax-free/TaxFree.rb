puts gets.split(',').map(&:to_f).map{|x| x < 20 ? 1.07 * x : x}.inject(:+)
