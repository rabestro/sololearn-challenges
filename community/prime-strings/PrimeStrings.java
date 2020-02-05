import java.util.Scanner;
import java.util.regex.Pattern;

public class PrimeStrings {

    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var string = input.nextLine();
        input.close();

        final var isPrime = !Pattern.matches("^(.+)\\1+$", string);

        System.out.println(isPrime ? "prime" : "not prime");
    }
}
