puts Array.new(gets.to_i){gets.chomp.gsub(/(\w)\w* (\w)\w*/,'\1\2')}.join(' ')
