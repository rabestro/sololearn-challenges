puts gets.split(/(?<=\d)/).map{|x| x[0] * x[1].to_i}.join
