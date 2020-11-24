/* 
Credit Card Validator

You need to verify if the given credit card number is valid. 
For that you need to use the Luhn test.

Here is the Luhn formula:
1. Reverse the number.
2. Multiple every second digit by 2. 
3. Subtract 9 from all numbers higher than 9.
4. Add all the digits together.
5. Modulo 10 of that sum should be equal to 0. 

Task: 
Given a credit card number, validate that it is valid 
using the Luhn test. 
Also, all valid cards must have exactly 16 digits.

Input Format:
A string containing the credit card number you need to verify.

Output Format:
A string: 'valid' in case the input is a valid credit card number
(passes the Luhn test and is 16 digits long), 
or 'not valid', if it's not.

Sample Input:
4091131560563988

Sample Output:
valid
*/

import java.util.Scanner;

/**
 * @author Jegors Čemisovs
 * <p>
 * {@link https://github.com/rabestro/sololearn-challenges}
 */
public final class CreditCardValidator {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        final var creditCardNumber = scanner.next();

        if (Luhn.isValid(creditCardNumber)) {
            System.out.print("valid");
        } else {
            System.out.print("not valid");
        }
    }
}

class Luhn {

    static boolean isValid(String number) {

        if (number.length() != 16) {
            return false;
        }
        var reverse = new StringBuilder(number).reverse().chars().map(c -> c - '0');
        int sum = 0;
        var isEven = false;

        for (int i : reverse.toArray()) {
            if (isEven) {
                i *= 2;
            }
            sum += i > 9 ? i - 9 : i;
            isEven = !isEven;
        }
        return 0 == sum % 10;
    }
}
