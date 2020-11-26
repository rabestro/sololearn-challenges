ahead = int(input())
if ahead%20==0:
  time = 10 + (ahead-1) // 20 * 20
else:
  time = 10 + ahead // 20 * 20
print(time)
