import java.util.Scanner;

public final class Security {
    public static void main(final String[] args) {
        final var floor = new Scanner(System.in).nextLine();
        
        final var isSafe = floor.matches(".*[$T].*G.*[$T].*");

        System.out.println(isSafe ? "quiet" : "ALARM");
    }
}
