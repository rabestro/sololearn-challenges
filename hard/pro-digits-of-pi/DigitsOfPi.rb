require 'bigdecimal'

# The Gauss–Legendre iterative algorithm

def calculatePi(precision = 1005)
   # The algorithm has quadratic convergence, which essentially means that
   # the number of correct digits doubles with each iteration of the algorithm.
   BigDecimal.limit(precision);
   
   one = BigDecimal(1)
   two = BigDecimal(2)
   four = BigDecimal(4)
   
   # Initial value setting:
   a = one
   b = one / two.sqrt(precision)
   t = one / four
   p = one
   
   # Repeat the following instructions until 
   # the difference of a and b is within the desired accuracy:
   c = one / 10 ** precision
   
   until (a - b).abs <= c do
       an = (a + b) / two
       bn = (a * b).sqrt(precision)
       tn = t - (p * ((a - an) ** two))
       pn = two * p
       
       a = an
       b = bn
       t = tn
       p = pn
   end
   
   # π is then approximated as:
   ((a + b) ** 2) / (t * four)
end

n = gets.to_i + 2
pi = calculatePi(n).to_s

puts pi[n]
