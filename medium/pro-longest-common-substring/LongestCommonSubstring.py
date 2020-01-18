import re
words = sorted(input().split(), key=len)
word = words[0]
length = len(word)

for i in range(length, 0, -1):
    substrings = set(word[j:j + i] for j in range(0, 1 + length - i))
    ok = sorted(list(filter(lambda ss: all(map(lambda w: ss in w, words[1:])), substrings)))
    if ok: break

print(ok[0])
