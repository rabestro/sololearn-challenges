phrase = gets.split
numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten']
puts phrase.map{|w| w=~/1?\d/ ? numbers[w.to_i]: w}.join(' ')
