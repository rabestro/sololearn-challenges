import java.util.Scanner;
import java.util.stream.IntStream;

public class ThatsOdd
{ 
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int count = input.nextInt();
        
        int sum = IntStream
            .generate(input::nextInt)
            .limit(count)
            .filter(i -> i % 2 == 0)
            .sum();
        
        System.out.print(sum);
    }
}
