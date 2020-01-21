import java.util.Scanner;
import java.util.regex.Pattern;

public class Security
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var floor = input.nextLine();
        input.close();

        final var isSafe = Pattern.matches(".*[$T].*G.*[$T].*", floor);

        System.out.println(isSafe ? "quiet" : "ALARM");
    }
}
