# Minimum time to meet

There are N friends spread across a grid of size - RxC. All the friends wants to meet at a common cell inside the grid. Also, the grid has certain cells set on fire such that no person can step onto these cells. Now, given that it takes 1 sec for a person to go from its current cell to any 1 of its neighbouring cells, find out the minimum time in which all the friends can meet.
2 cells are considered neighbours if they share a common side.

## Input Format

First line of input contains T - number of test cases. First line of each test case contains R,C,N - the size of the matrix and the number of friends. Its followed by a matrix of size RxC consisting only of:
0: Empty Cells
1: Fiery Cells
2: Location of a person

Constraints

1 <= T <= 100
1 <= R,C <= 100
1 <= N <= 10

## Output Format

For each test case, print the minimum amount of time in which all the friends can meet, separated by new line. If its not possible for the friends to meet, print -1.

## Sample Input 0

```
5 5 2
20002
00000
00000
00000
00000
2 2 1
10
21 
2 2 2
12
21
11 6 3
010001
001002
010100
000000
000101
100000
010101
000000
010201
100000
020001
```

## Sample Output 0
```
2
0
-1
7
```
