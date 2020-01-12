sales = int(input())

income = sales * 3

if income > 21:
    print("Profit")
elif income < 21:
    print("Loss")
else:
    print("Broke Even")
