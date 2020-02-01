import java.util.Scanner;
import java.util.Locale;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MilitaryTime {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var time = LocalTime.parse(
            input.nextLine(), 
            DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT)
                .withLocale(Locale.US));
        
        System.out.println(time);
    }
}
