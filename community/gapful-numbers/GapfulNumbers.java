// Gapful numbers
// https://www.sololearn.com/learn/14303/?ref=app

import java.util.Scanner;
import java.util.stream.IntStream;

public class GapfulNumbers {

    public static boolean isGapful(final int number) {
        return number > 99 
            && number <= 999 
            && 0 == number % (number / 100 + number % 10);
    }
    
    public static void main(final String[] args) {
        
        final var in = new Scanner(System.in);
        final var start = in.nextInt();
        final var end = in.nextInt();
        in.close();
        
        IntStream.rangeClosed(start, end)
            .filter(GapfulNumbers::isGapful)
            .forEach(System.out::println);
        
    }
}
