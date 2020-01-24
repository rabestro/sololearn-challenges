numbers = [int(input()) for i in range(int(input()))]
missing = list(set(range(numbers[0], numbers[-1])) - set(numbers))
output = ' '.join(map(str, sorted(missing)))
print(output)
