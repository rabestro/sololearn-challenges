import java.util.Scanner;

public final class Argentina {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        final var pesos = scanner.nextInt();
        final var dollars = scanner.nextInt();
        
        System.out.println(
            dollars * 50l > pesos ? "Pesos" : "Dollars"
        );
    }
}
