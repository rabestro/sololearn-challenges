import java.util.Map;
import java.util.Scanner;

public final class NoNumerals {
    public static void main(String[] args) {
        final var numbers = Map.of(
                "10", "ten", "1", "one", "2", "two", "3", "three", "4", "four",
                "5", "five", "6", "six", "7", "seven", "8", "eight", "9", "nine");

        new Scanner(System.in)
                .tokens()
                .map(word -> (numbers.containsKey(word) ? numbers.get(word) : word) + " ")
                .forEach(System.out::print);
    }
}
