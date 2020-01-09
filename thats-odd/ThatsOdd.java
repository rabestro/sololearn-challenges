import java.util.Scanner;

public class Program
{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
