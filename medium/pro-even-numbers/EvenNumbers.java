import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenNumbers
{ 
    public static void main(String[] args) {
        final var in = new Scanner(System.in);
        
        IntStream
            .generate(in::nextInt)
            .filter(i -> i % 2 == 0)
            .forEach(i -> System.out.printf("%d ", i));
    }
}
