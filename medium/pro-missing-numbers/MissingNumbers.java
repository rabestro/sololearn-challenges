/*
Missing Numbers

You are given a list of whole numbers in ascending order. 
You need to find which numbers are missing in the sequence.

Task: 
Create a program that takes in a list of numbers and outputs 
the missing numbers in the sequence separated by spaces.

Input Format: 
The first input denotes the length of the list (N). 
The next N lines contain the list elements as integers. 

Output Format: 
A string containing a space-separated list of the missing numbers.

Sample Input: 
5
2
4
5
7
8

Sample Output: 
3 6
*/

import java.util.Scanner;

/**
 * @author Jegors Čemisovs
 *
 * {@link https://github.com/rabestro/sololearn-challenges}
 */
public class MissingNumbers {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var count = input.nextInt();     
        final var numbers = input.tokens().limit(count).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0, n = numbers[i]; n < numbers[count - 1]; ++n) {
            if (n == numbers[i]) {
                ++i;
            } else {
                System.out.printf("%d ", n);
            }
        }                            
    }
}
