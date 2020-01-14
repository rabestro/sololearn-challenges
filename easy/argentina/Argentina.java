import java.util.Scanner;

public class Argentina
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int pesos = input.nextInt();
        final int dollars = input.nextInt();
        
        System.out.print(dollars * 50l > pesos ? "Pesos" : "Dollars");
    }
}
