import java.util.Scanner;
import static java.util.Arrays.asList;

public class SafetyDepositBoxesArrays {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var items = input.nextLine();
        final var lookingFor = input.nextLine();
        input.close();

        final int time = 5 + 5 * asList(items.split(",")).indexOf(lookingFor);

        System.out.print(time);
    }
}
