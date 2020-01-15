# 2D Map  

You're given a representation of a 5x5 2D map, and if you can only move left, right, up, or down, determine how many moves you would have to make to get between two points on the map.

## Task:
 Determine the total number of moves that are needed between two points on a map.  The points that you move between are marked with a P and the spaces in between are marked with X.

## Input Format: 
A string that represents the 2D space starting at the top left.  Each level from top to bottom is separated by a comma.

## Output Format: 
An integer that represents the total number of moves that you had to make.

## Sample Input: 
```
XPXXX,XXXXX,XXXXX,XXXPX,XXXXX
```
## Sample Output: 
```
5
```
## Explanation:
The map looks as:
```
XPXXX
XXXXX
XXXXX
XXXPX
XXXXX
```
You had to move right 2 spaces, then down 3 spaces for a total of 5 moves.
