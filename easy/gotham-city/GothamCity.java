import java.util.Scanner;

public class GothamCity {
    public static void main(final String[] args) {
        final var in = new Scanner(System.in);
        final var criminals = in.nextInt();
        in.close();

        if (criminals < 5) {
            System.out.print("I got this!");
        } else if (criminals < 11) {
            System.out.print("Help me Batman");
        } else {
            System.out.print("Good Luck out there!");
        }
    }
}
