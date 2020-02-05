import java.util.Scanner;

public class MilitaryTimeClassic {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        var hours = Integer.parseInt(input.findInLine("\\d?\\d"));
        final var minutes = input.findInLine("\\d\\d");
        final var indicator = input.findInLine("(A|P)M").charAt(0);

        if (indicator == 'P') {
            hours += 12;
        } else if (hours == 12) {
            hours = 0;
        }

        System.out.printf("%02d:%s", hours, minutes);
    }
}



