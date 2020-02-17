s = gets.chomp
n = gets.to_i

puts s.split(Regexp.new '(?<=\G.{%d})' % n).join('-')
