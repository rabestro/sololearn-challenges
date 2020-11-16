import java.util.Scanner;

public final class GothamCity {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        final var criminals = scanner.nextInt();

        if (criminals < 5) {
            System.out.print("I got this!");
        } else if (criminals < 11) {
            System.out.print("Help me Batman");
        } else {
            System.out.print("Good Luck out there!");
        }
    }
}
