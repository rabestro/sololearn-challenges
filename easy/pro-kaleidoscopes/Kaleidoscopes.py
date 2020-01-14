number = int(input())
price = 5 * number
if number > 1:
    price *= 0.9 # 10% discount
price *= 1.07 # Tax
print("%.2f" % price)
