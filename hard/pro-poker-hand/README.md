# Poker Hand

You are playing poker with your friends and need to evaluate your hand. 
A hand consists of five cards and is ranked, from lowest to highest, in the following way:
- High Card: Highest value card (from 2 to Ace).
- One Pair: Two cards of the same value.
- Two Pairs: Two different pairs.
- Three of a Kind: Three cards of the same value.
- Straight: All cards are consecutive values.
- Flush: All cards of the same suit.
- Full House: Three of a kind and a pair.
- Four of a Kind: Four cards of the same value.
- Straight Flush: All cards are consecutive values of same suit.
- Royal Flush: 10, Jack, Queen, King, Ace, in same suit. 

## Task:
Output the rank of the give poker hand. 

## Input Format: 
A string, representing five cards, each indicating the value and suite of the card, separated by spaces. 
Possible card values are: 2 3 4 5 6 7 8 9 10 J Q K A
Suites:  H (Hearts), D (Diamonds), C (Clubs), S (Spades)
For example, JD indicates Jack of Diamonds. 

## Output Format:
A string, indicating the rank of the hand (in the format of the above description). 

## Sample Input:

```
JS 2H JC AC 2D
```

## Sample Output: 

```
Two Pairs
```

## Explanation: 
The hand includes two Jacks and two 2s, resulting in Two Pairs.
