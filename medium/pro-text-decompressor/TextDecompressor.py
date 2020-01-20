text = input()
decompressed = ''.join(text[i]*int(text[i+1]) for i in range(0,len(text),2))
print(decompressed)
