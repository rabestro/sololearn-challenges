import java.util.Scanner;

public class ConvertDate_RE
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);

        input.findInLine("(.*)[ /](\\d{1,2})[,/] ?(\\d{4})");
        final var usDate = input.match();
        
        int month;
        switch (usDate.group(1)) {
            case "January":  month = 1; break;
            case "February": month = 2; break;
            case "March": month = 3; break;
            case "April": month = 4; break;
            case "May": month = 5; break;
            case "June": month = 6; break;
            case "July": month = 7; break;
            case "August": month = 8; break;
            case "September": month = 9; break;
            case "October": month = 10; break;
            case "November": month = 11; break;
            case "December": month = 12; break;
            default: month = Integer.valueOf(usDate.group(1));
        }
        final var day = usDate.group(2);
        final var year = usDate.group(3);
        
        System.out.printf("%s/%d/%s", day, month, year);
    }
}
