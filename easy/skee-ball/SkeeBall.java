import java.util.Scanner;

public class SkeeBall
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var points = input.nextInt();
        final var price = input.nextInt();
        input.close();
        
        System.out.print(points / 12 >= price ? "Buy it!" : "Try again");
    }
}
