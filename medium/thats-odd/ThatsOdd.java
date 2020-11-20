import java.util.Scanner;
import java.util.stream.IntStream;

public final class ThatsOdd {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final int count = scanner.nextInt();
        final int sum = IntStream
                .generate(scanner::nextInt)
                .limit(count)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.print(sum);
    }
}
