/* 
Base Converter

In mathematics, a base is the number of different digits or combination of digits and letters that a system of counting uses to represent numbers. For example, the most common base used today is the decimal system. Because "dec" means 10, it uses the 10 digits from 0 to 9. A decimal number has base 10, a binary has base 2, an octal has base 8, etc.

Given a non-negative integer & a base as input, create a program to convert the given decimal into the corresponding base.

Input: 25 7
Output: 34

Input: 368 4
Output: 11300

Input: 78 3
Output: 2220
*/

import java.util.Scanner;

public class BaseConverter {
	public static void main(String[] args) {
		
		final var input = new Scanner(System.in);
		final var number = input.nextInt();
		final var base = input.nextInt();
		input.close();
		
		if (1 < base && base < 37) {
		    System.out.printf("%d in %d base is %s", number, base, convert(number, base));
		} else {
		    System.out.println("Please enter base between 2 and 36");
		}
		
	}
	
	static String convert(int number, int base) {
		final var digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final var result = new StringBuilder(number > 0 ? "": "0");
		while (number > 0) {
			result.append(digits.charAt(number % base));
			number /= base;
		}
		return result.reverse().toString();
	}
}
