C, M, Y, K = Array.new(4){gets.to_f}

R = (255 * (1-C) * (1-K)).round
G = (255 * (1-M) * (1-K)).round
B = (255 * (1-Y) * (1-K)).round

puts '%d,%d,%d' % [R, G, B]
