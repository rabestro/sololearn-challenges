import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ConvertDate {

    public static void main(String[] args) {
        
        final var usDate = new java.util.Scanner(System.in).nextLine();
        
        final var usFormat = Character.isDigit(usDate.charAt(0))
                ? DateTimeFormatter.ofPattern("M/d/yyyy")
                : DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US)
        
        final var euDate = DateTimeFormatter
            .ofPattern("d/M/yyyy").format(LocalDate.parse(usDate, usFormat));
        
        System.out.println(euDate);
    }
}
