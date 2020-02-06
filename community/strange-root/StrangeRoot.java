/* 
Strange Root

A number has a strange root if its square and square root share any digit. 
For example, 2 has a strange root because the square root of 2 equals 1.414 
(consider the first three digits after the dot) and it contains 4 (which is the square of 2).

Examples:
Input: 11
Output: true 
(the square root of 11 is 3.317, the square of 11 is 121. They share the same digit, 1.)
 
Input: 24
Output: false (the square root of 24 (4.899) and square (576) do not share any digits) 

Write a program to check if the user input has a strange root or not.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class StrangeRoot {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var number = input.nextInt();
        input.close();
        
        final long square = number * number;
        final long root = (int) Math.round(1000 * Math.sqrt(number)) % 1000;
        
        final var squareDigits = Long.toString(square);
        final var rootDigits = Long.toString(root);
        final var isStrangeRoot = Pattern.matches(".*(\\d).*&.*\\1.*", squareDigits + "&" + rootDigits);
        
        System.out.printf("%16s:%10d%n", "Number", number);
        System.out.printf("%16s:%10d%n", "Square", square);
        System.out.printf("%16s:%10.3f%n", "Root", Math.sqrt(number));
        System.out.printf("%16s:%10s%n", "Is strange root", isStrangeRoot);
    }
}
