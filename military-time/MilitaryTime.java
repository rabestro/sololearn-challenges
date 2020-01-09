import java.util.Scanner;

public class MilitaryTime
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        
        input.findInLine("(\\d?\\d):(\\d\\d) (A|P)M");
        final var usTime = input.match();
        
        var hours = Integer.valueOf(usTime.group(1));
        final var minutes = Integer.valueOf(usTime.group(2));
        final var indicator = usTime.group(3).charAt(0);
        
        if (indicator == 'P') {
            hours += 12;
        } else if (hours == 12) {
            hours = 0;
        }
        
        System.out.printf("%02d:%02d", hours, minutes);
    }
}
