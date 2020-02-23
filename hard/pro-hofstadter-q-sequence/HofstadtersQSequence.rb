def Q(n)
   q = Array.new(2, 1)
   2.upto(n - 1){|i| q << q[i - q.last] + q[i - q[i - 2]]}
   return q.last
end

n = gets.to_i
puts Q(n)
