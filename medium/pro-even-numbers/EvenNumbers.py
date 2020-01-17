numbers = [int(i) for i in input().split()]
even = filter(lambda x: x % 2 == 0, numbers)
result = ' '.join(map(str, even))
print(result)
