import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ConvertDate {

    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var usDate = input.nextLine();
        input.close();
        
        final var euDate = DateTimeFormatter.ofPattern("d/M/yyyy").format(
            LocalDate.parse(usDate, 
                Character.isDigit(usDate.charAt(0))
                ? DateTimeFormatter.ofPattern("M/d/yyyy")
                : DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US)));
        
        System.out.println(euDate);
    }
}
