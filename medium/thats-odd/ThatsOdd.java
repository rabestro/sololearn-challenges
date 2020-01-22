import java.util.Scanner;

public class ThatsOdd
{ 
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int count = input.nextInt();
        
        int sum = input
            .tokens()
            .limit(count)
            .mapToInt(Integer::parseInt)
            .filter(i -> i % 2 == 0)
            .sum();
        
        System.out.print(sum);
    }
}
