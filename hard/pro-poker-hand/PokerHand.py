import re 
hand = input()
cardValue = {'2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, \
	'8': 8, '9': 9, '10': 10, 'J': 11, 'Q': 12, 'K': 13, 'A': 14}
	
isColor = re.search(r'1?.(.)( 1?.\1){4}', hand) is not None
cards = [cardValue[c[0:-1]] for c in hand.split(' ')]
cards.sort()
isOrder = cards[4] - cards[0] == 4 or cards[4] == 14 \
   and cards[0] == 2 and cards[1] == 3 and cards[2] == 4 and cards[3] == 5
combination = ''.join(chr(64 + i) for i in cards)

if isColor and isOrder and cards[0] == 10:
    print('Royal Flush')
elif isColor and isOrder:
    print('Straight Flush')
elif isColor:
    print('Flush')
elif isOrder:
    print('Straight')
elif re.search(r'.?(.)\1\1\1', combination) is not None:
    print('Four of a Kind')
elif re.search(r'(.)\1\1(.)\2', combination) is not None \
  or re.search(r'(.)\1(.)\2\2', combination) is not None:
    print('Full House')
elif re.search(r'.*(.)\1\1.*', combination) is not None:
    print('Three of a Kind')
elif re.search(r'.*(.)\1.*(.)\2', combination) is not None:
    print('Two Pairs')
elif re.search(r'.*(.)\1.*', combination) is not None:
    print('One Pair')
else:
    print('High Card')
