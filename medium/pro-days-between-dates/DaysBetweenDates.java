import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class DaysBetweenDates {
    public static void main(final String[] args) {
        final var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US);
        final var scanner = new Scanner(System.in);
        final var firstDate = LocalDate.parse(scanner.nextLine(), formatter);
        final var secondDate = LocalDate.parse(scanner.nextLine(), formatter);
  
        final long days = firstDate.until(secondDate, DAYS);
        System.out.println(days);
    }
}
