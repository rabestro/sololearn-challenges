aWidth, aLength = [int(i) for i in input().split(',')]
bWidth, bLength = [int(i) for i in input().split(',')]
if (aWidth * aLength) > (bWidth * bLength):
    print("Apartment A")
else:
    print("Apartment B")
