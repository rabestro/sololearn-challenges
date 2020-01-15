# Hofstadter's Q-Sequence  

Hofstadter's Q-Sequence is a sequence of numbers where every integer above zero has a corresponding q-sequence value.  
You can determine the q-sequence value from a formula that tells you how far back in the sequence to go and add two values together.  
The first two values of the sequence are Q(1) = 1 and Q(2) = 1, and every number above 2 can be expressed according to the following formula (where n is your input value): Q(n) = Q(n - Q(n - 1)) + Q(n - Q(n -2))
 
## Task: 
Given an integer value input, determine and output the corresponding q-sequence value.

## Input Format: 
A positive integer value.

## Output Format: 
A positive integer value that represents the value in the q-sequence that the input holds.

## Sample Input: 
```
5
```
## Sample Output: 
```
3
```
## Explanation: 
```
Q(5) = Q(5-Q(5-1))+Q(5-Q(5-2)) = Q(5-Q(4))+Q(5-Q(3)) = Q(5-3)+Q(5-2) = Q(2)+Q(3) = 1+2 = 3
```
