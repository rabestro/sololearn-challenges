/* 

   A number is called a Disarium number if the sum of the powers of its digits 
   equals the number itself. The digits are powered to their positions in the number.
   
   Input: one number for test 
		  or two numbers for a range.
   
   Output: true/false for one number
		   or all the Disarium numbers in a given range. 

*/

import java.util.Scanner;
import java.util.stream.IntStream;

public class DisariumNumbers {

    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var lowerBound = sc.nextInt();
        final var isRange = sc.hasNextInt();
        final var upperBound = isRange ? sc.nextInt() : lowerBound;
        sc.close();

        if (isRange) {
            IntStream.range(lowerBound, upperBound)
                    .filter(DisariumNumbers::isDisarium)
                    .forEach(System.out::println);
        } else {
            System.out.println(isDisarium(lowerBound));
        }
    }

    public static boolean isDisarium(int n) {
        final var digits = Integer.toString(n).chars().map(c -> c - '0').toArray();
        for (int p, digit, power = digits.length; power > 0 && n >= 0; n -= p) {
            p = digit = digits[--power];
            for (int i = power; i-- > 0; p *= digit) ;
        }
        return n == 0;
    }
}
