# Snap, Crackle and Pop

You have six bowls of Rice Krispies in front of you, and they make different noises when you pour milk over them based on the total number of Rice Krispies in each bowl.
If a bowl has a number of Rice Krispies that is divisible by 3, it will make a Pop sound. If it is not divisible by 3 but is odd it will make a Snap sound.  If it is not divisible by 3, but it is even, it will make a Crackle sound.

## Task: 
Based on the quantities in each bowl, output the noise that they make.

## Input Format: 
You receive 6 integers and each integer represents the number of Rice Krispies in your bowls.

## Output Format: 
You should output a string with the sounds made by each bowl separated by spaces in the order that they were input.

## Sample Input: 
```
18
5
100
25
40
24
```
## Sample Output: 
```
Pop Snap Crackle Snap Crackle Pop
```
## Explanation: 
Each number divisible by 3 makes a pop sound. If not, the even numbers produce a Crackle, and the odd numbers produce a Snap.
