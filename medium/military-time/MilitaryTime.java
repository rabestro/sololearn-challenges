import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class MilitaryTime {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var usTime = input.nextLine();
        input.close();

        final var formatter = DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT)
                .withLocale(Locale.US);

        final var euTime = LocalTime.parse(usTime, formatter);

        System.out.println(euTime);
    }
}
