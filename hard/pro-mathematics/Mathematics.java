/* Power Calculator

The class calculate an expression with integers.
Priority of operations are supported. 
Operations are: +,-,*,/,%, bitwise: ^,&,| and # for power.

Input: any arithmetic expression like: 5 + 7*3-12/(2 + 2*2) 
*/

import java.util.*;
import java.util.regex.Pattern;
import static java.lang.Long.parseLong;

class PowerCalculator {

	private interface ArithmeticOperation {
		long calculate(long x, long y);
	}
	
	private static final List<Pattern> patterns;
	private static final String[] priority;
	private static final Map<Character, ArithmeticOperation> operations;
	
	static {
		priority = new String[] {"#", "*/%", "+-", "&^|"};
		patterns = new ArrayList<Pattern>();
		patterns.add(Pattern.compile("(?<before>.*?)\\((?<inside>[^()]+)\\)(?<after>.*)"));
		
		for (final var operations : priority) {
			patterns.add(Pattern.compile(String.format(
				"(?<before>.*?)(?<x>(^-)?\\d+)(?: *)(?<op>[%s])(?: *)(?<y>-?\\d+)(?<after>.*)"
				, operations)));
		}

		operations = Map.of(
			'+', (a, b) -> a + b, 
			'-', (a, b) -> a - b,
			'*', (a, b) -> a * b, 
			'/', (a, b) -> a / b, 
			'%', (a, b) -> a % b,
			'^', (a, b) -> a ^ b,
			'&', (a, b) -> a & b,
			'|', (a, b) -> a | b,
			'#', (a, b) -> (long) Math.pow(a, b));
	}
	
	static long calculate(String expression) {
		for (var pattern : patterns) {
			final var m = pattern.matcher(expression);
			final long result;
			
			if (m.matches()) {
				if (m.groupCount() == 3) {
					result = calculate(m.group("inside"));
				} else {
					result = operations.get(m.group("op").charAt(0)).calculate(
						parseLong(m.group("x")), parseLong(m.group("y")));
				}
				return calculate(m.group("before") + result + m.group("after"));
			}
		}
		return parseLong(expression);
	}
}

public class Mathematics {
	public static void main(String[] args) {
		final var sc = new Scanner(System.in);
		final var number = sc.nextInt();
		
		var isMatch = false;
		var index = 0;
		
		while (sc.hasNext()) {
		    final var expression = sc.next();
			final var result = PowerCalculator.calculate(expression);
     	    isMatch = result == number;
			if (isMatch) break;
			++index;
		}
		if (isMatch) {
			System.out.printf("index %d", index);
		} else {
			System.out.println("none");
		}
		sc.close();
	}
}
