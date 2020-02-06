/* 
Collatz Conjecture

The Collatz conjecture (also known as the Ulam conjecture or the Syracuse problem) 
is an unsolved mathematical problem, which is very easy to formulate:

Take any natural number
If it's even, half it, otherwise triple it and add one
Repeat step 2. until you reach 4, 2, 1 sequence
You will ALWAYS reach 1, eventually.

That last sequence: 4, 2, 1 is an infinitely repeating loop. 
The formulated conjecture is that for any x the sequence 
will always reach 4, 2, 1 ultimately.

While the problem cannot be proved, the assignment is 
to write a code that will produce and print out 
the whole sequence for an input number.
*/

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var number = input.nextInt();
        input.close();

        System.out.printf("x = %d%n%n", number);

        for (int i = number; i > 1; ) {
            final var isEven = i % 2 == 0;
            System.out.printf("%d %s = %d%n"
                    , i
                    , isEven ? "/ 2" : "* 3 + 1"
                    , i = isEven ? i / 2 : 3 * i + 1
            );
        }
        System.out.println("...");
    }
}
