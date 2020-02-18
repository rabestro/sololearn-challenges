puts gets.split(' ').map(&:to_f).any?{|x| 20 < 1.1 * x} ? 'Back to the store' : 'On to the terminal'
