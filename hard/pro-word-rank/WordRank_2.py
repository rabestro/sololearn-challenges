from math import factorial

w = word = input()
s = sorted(w)
rank = 1
if s == w:
  pass
else:
  while len(w) > 1:
    m = list(filter(lambda x: x > 1, map(s.count, set(w)))) # the list of repetitions of letters
    t = factorial(len(w) - 1) * s.index(w[0])
    for i in m: 
        t /= factorial(i)
    rank += t
    w = w[1:]
    s = sorted(w)
    
print(int(rank))
