encoded = input()
decoded = ''.join(c for c in encoded[::-1] if c.isalpha() or c.isspace())
print(decoded)
