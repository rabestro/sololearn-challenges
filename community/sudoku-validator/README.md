# Sudoku Validator

A solved sudoku puzzle is a matrix of typically 9*9 in which every row, every column and every block contains every number from 1 to 9 exactly once.

> A block is a 3*3 area in the sudoku that you get by splitting it up into 9 even squares (similar to a tic-tac-toe board).

Create an algorithm that checks any solved sudoku's validity.

Examples:
```
Input: [
    [3, 5, 2, 9, 1, 8, 6, 7, 4],
    [8, 9, 7, 2, 4, 6, 5, 1, 3],
    [6, 4, 1, 7, 5, 3, 2, 8, 9],
    [7, 8, 3, 5, 6, 9, 4, 2, 1],
    [9, 2, 6, 1, 3, 4, 7, 5, 8],
    [4, 1, 5, 8, 2, 7, 9, 3, 6],
    [8, 6, 4, 3, 7, 5, 8, 9, 2],
    [2, 7, 8, 4, 9, 1, 3, 6, 5],
    [5, 3, 9, 6, 8, 2, 1, 4, 7]
  ]
Output: false

Input: [
    [3, 5, 2, 9, 1, 8, 6, 7, 4],
    [8, 9, 7, 2, 4, 6, 5, 1, 3],
    [6, 4, 1, 7, 5, 3, 2, 8, 9],
    [7, 8, 3, 5, 6, 9, 4, 2, 1],
    [9, 2, 6, 1, 3, 4, 7, 5, 8],
    [4, 1, 5, 8, 2, 7, 9, 3, 6],
    [1, 6, 4, 3, 7, 5, 8, 9, 2],
    [2, 7, 8, 4, 9, 1, 3, 6, 5],
    [5, 3, 9, 6, 8, 2, 1, 4, 7]
  ]
Output: true
```
> Bonus: Change the code to mark all mistakes in the sudoku puzzle.
