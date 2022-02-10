def q(num):
    if num==1 or num==2:
        return 1
    else:
        return q(num-q(num-1)) + q(num-q(num-2))
print(q(int(input())))
