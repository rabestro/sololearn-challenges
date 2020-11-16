import java.util.Scanner;

public final class FruitBowl {
    public static void main(final String[] args) {
        final int fruit = new Scanner(System.in).nextInt();

        final int apples = fruit / 2;
        final int pies = apples / 3;
        
        System.out.print(pies);
    }
}
