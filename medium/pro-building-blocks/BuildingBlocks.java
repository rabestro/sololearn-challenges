import java.util.Scanner;
import java.util.stream.IntStream;

public final class BuildingBlocks {
    private static final int COLORS = 4;
    private static final int STUDENTS = 15;
        
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var sum = IntStream
                .generate(scanner::nextInt)
                .limit(COLORS)
                .map(i -> i % STUDENTS)
                .sum();

        System.out.print(sum);
    }
}
