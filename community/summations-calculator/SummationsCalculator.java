/*
Summations Calculator

Create a program that takes 3 inputs, a lower bound, an upper bound and the expression. 
Calculate the sum of that range based on the given expression and output the result.

For Example:
Input: 2 4 *2
Output: 18 (2*2 + 3*2 + 4*2)

Input: 1 5 %2
Output: 3 (1%2 + 2%2 + 3%2 + 4%2 + 5%2)
*/

import java.util.Scanner;
import java.util.stream.IntStream;

public class SummationsCalculator {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var lowerBound = input.nextInt();
        final var upperBound = input.nextInt();
        final var operator = input.findInLine("[-*/+%]").charAt(0);
        final var number = input.nextInt();
        input.close();
        
        final var result = IntStream.rangeClosed(lowerBound, upperBound).map(i -> {
            switch(operator) {
                case '+': return i + number;
                case '-': return i - number;
                case '*': return i * number;
                case '/': return i / number;
                default: return i % number;
            }
        }).sum();

        System.out.println(result);
    }
}
