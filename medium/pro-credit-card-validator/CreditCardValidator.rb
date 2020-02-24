puts (n=gets).size == 16 && n.reverse.chars.map(&:to_i).map.with_index{|x,i| i.odd?? x>4 ? x*2-9: x*2: x}.sum%10==0 ? 'valid': 'not valid'
