puts gets.downcase.chars.map{|c| c=~/^[a-z]$/?('az'.sum-c.ord).chr: c}.join
