/* Power Calculator

The class calculate an expression with integers.
Priority of operations are supported. 
Operations are: +,-,*,/,%.

Input: any arithmetic expression like: 5 + 7*3-12/(2 + 2*2) 
*/

import java.util.*;
import java.util.regex.Pattern;
import static java.lang.Long.parseLong;

class PowerCalculator {

    @FunctionalInterface
    private interface ArithmeticOperation {
        long calculate(long x, long y);
    }
    
    private static final List<Pattern> PATTERNS;
    private static final Map<Character, ArithmeticOperation> OPERATIONS;
    private static final String PARENTHESES = 
        "(?<before>.*?)\\((?<inside>[^()]+)\\)(?<after>.*)";
    private static final String EXPRESSION = 
        "(?<before>.*?)(?<x>(^-)?\\d+)(?: *)(?<op>[%s])(?: *)(?<y>-?\\d+)(?<after>.*)";
    
    static {
        final String[] priority = new String[] {"*/%", "+-"};
        
        PATTERNS = new ArrayList<Pattern>();
        PATTERNS.add(Pattern.compile(PARENTHESES));
        for (final var operations : priority) {
            PATTERNS.add(Pattern.compile(String.format(EXPRESSION, operations)));
        }

        OPERATIONS = Map.of(
            '+', (a, b) -> a + b, 
            '-', (a, b) -> a - b,
            '*', (a, b) -> a * b, 
            '/', (a, b) -> a / b, 
            '%', (a, b) -> a % b);
    }
    
    static long calculate(String expression) {
        
        for (final var pattern : PATTERNS) {
            final var m = pattern.matcher(expression);
            if (!m.matches()) continue;
            
            final long result;
            final var isParentheses = m.groupCount() == 3;
            
            if (isParentheses) {
                result = calculate(m.group("inside"));
            } else {
                final var op = m.group("op").charAt(0);
                final var x = parseLong(m.group("x"));
                final var y = parseLong(m.group("y"));
                    
                result = OPERATIONS.get(op).calculate(x, y);
            }
            return calculate(m.group("before") + result + m.group("after"));
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
    }
}
