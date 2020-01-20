import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;

public class DayOfWeek {

    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var usDate = input.nextLine();
        input.close();
        
        final var dayOfWeek = LocalDate.parse(usDate, 
                Character.isDigit(usDate.charAt(0))
                ? DateTimeFormatter.ofPattern("M/d/yyyy")
                : DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US))
            .getDayOfWeek()
            .getDisplayName(TextStyle.FULL, Locale.US);
        
        System.out.println(dayOfWeek);
    }
}
