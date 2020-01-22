import java.util.Scanner;

public class ThatsOdd_old
{ 
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int summa = 0;
        
        while (count-- > 0) {
            final int number = input.nextInt();
            if (number % 2 == 0) {
            	summa += number;
            }
        }
        System.out.print(summa);
    }
}
