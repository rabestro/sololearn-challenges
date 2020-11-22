import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public final class DayOfWeek {
    public static void main(String[] args) {
        final var usDate = new Scanner(System.in).nextLine();
        final var dayOfWeek = LocalDate.parse(usDate,
                Character.isDigit(usDate.charAt(0))
                        ? DateTimeFormatter.ofPattern("M/d/yyyy")
                        : DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US))
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.US);

        System.out.println(dayOfWeek);
    }
}
