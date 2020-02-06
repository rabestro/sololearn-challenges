import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        final var input = new Scanner(System.in);
        final var a = input.nextInt();
        final var b = input.nextInt();
        final var c = input.nextInt();
        input.close();

        final var isValidTriangle = a + b > c && a + c > b && b + c > a;

        System.out.print(isValidTriangle);
    }
}
