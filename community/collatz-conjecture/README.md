# Collatz Conjecture

The Collatz conjecture (also known as the Ulam conjecture or the Syracuse problem) is an unsolved mathematical problem, which is very easy to formulate:

1. Take any natural number
2. If it's even, half it, otherwise triple it and add one
3. Repeat step 2. until you reach 4, 2, 1 sequence
4. You will ALWAYS reach 1, eventually.

Example:
```
x = 17

17 * 3 + 1 = 52
52 / 2 = 26
26 / 2 = 13
13 * 3 + 1 = 40
40 / 2 = 20
20 / 2 = 10
10 / 2 = 5
5 * 3 + 1 = 16
16 / 2 = 8
8 / 2 = 4
4 / 2 = 2
2 / 2 = 1
1 * 3 + 1 = 4
...
```

That last sequence: 4, 2, 1 is an infinitely repeating loop. The formulated conjecture is that for any x the sequence will always reach 4, 2, 1 ultimately.

While the problem cannot be proved, the assignment is to write a code that will produce and print out the whole sequence for an input number.

> Both recursive and iterative approaches count. Bonus points for printing out how many iterations it took for x to converge to 1.
