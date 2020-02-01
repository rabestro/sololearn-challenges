import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ConvertDate {
    public static void main(String[] args) {
        final var input = Scanner(System.in);
        final var usDate = input.nextLine();
        input.close();
        
        final var usShortFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        final var usLongFormat  = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US);
        
        final var isFirstSymbolDigit = Character.isDigit(usDate.charAt(0));
        
        final var usFormat      = isFirstSymbolDigit ? usShort : usLong;
        final var euFormat      = DateTimeFormatter.ofPattern("d/M/yyyy");
        
        final var euDate = euShort.format(LocalDate.parse(usDate, usFormat));
        
        System.out.println(euDate);
    }
}
