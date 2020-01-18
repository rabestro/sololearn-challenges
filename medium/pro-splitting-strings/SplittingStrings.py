word = input()
n = int(input())

print('-'.join(word[i:i+n] for i in range(0, len(word), n)))
