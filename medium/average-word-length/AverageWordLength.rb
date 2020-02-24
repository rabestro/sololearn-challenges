puts ((essay=gets).gsub(/[^a-zA-Z]+/,'').size.to_f / essay.split.size).ceil
