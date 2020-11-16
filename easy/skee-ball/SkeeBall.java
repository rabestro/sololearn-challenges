import java.util.Scanner;

public final class SkeeBall {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var points = scanner.nextInt();
        final var price = scanner.nextInt();
        
        System.out.println(
            points / 12 >= price ? "Buy it!" : "Try again"
        );
    }
}
