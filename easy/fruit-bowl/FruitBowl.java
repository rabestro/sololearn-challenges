import java.util.Scanner;

public class FruitBowl
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var fruit = input.nextInt();
        input.close();

        final int apples = fruit / 2;
        final int pies = apples / 3;
        
        System.out.print(pies);
    }
}
