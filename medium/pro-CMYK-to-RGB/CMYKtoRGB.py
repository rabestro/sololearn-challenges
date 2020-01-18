C, M, Y, K = [float(input()) for i in range(4)]

R = round(255 * (1-C) * (1-K))
G = round(255 * (1-M) * (1-K))
B = round(255 * (1-Y) * (1-K))

print(f'{R},{G},{B}')
