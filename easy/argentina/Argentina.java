import java.util.Scanner;

public class Argentina
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var pesos = input.nextInt();
        final var dollars = input.nextInt();
        input.close();
        
        System.out.print(dollars * 50l > pesos ? "Pesos" : "Dollars");
    }
}
