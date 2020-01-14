import java.util.Scanner;

public class SkeeBall
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int points = input.nextInt();
        final int price = input.nextInt();

        System.out.print(points / 12 >= price ? "Buy it!" : "Try again");
    }
}
