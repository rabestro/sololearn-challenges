def word_rank(word, rank, prefix = ''):
	if len(word) < 2:
		return prefix + word
	s = set(word)
	
	for c in sorted(list(s)):
		l = list(word)
		l.remove(c)
		output = word_rank(''.join(l), rank, prefix + str(c))
		if output is None: continue
		rank[0] += 1
		# print(f'{rank[0]:3} {output}')
		if output == rank[1]:
		    print(rank[0])
		    exit
		    

string = input()
word = sorted(string)
length = len(word)
rank = [0, string]
word_rank(string, rank)
