import java.util.Scanner;
import java.util.stream.IntStream;

public class BuildingBlocks
{ 
    public static void main(String[] args) {
        final var COLORS = 4;
        final var STUDENTS = 15;
        final var in = new Scanner(System.in);
        
        int sum = IntStream
            .generate(in::nextInt)
            .limit(COLORS)
            .map(i -> i % STUDENTS)
            .sum();
        
        System.out.print(sum);
    }
}
