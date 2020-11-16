import java.util.Scanner;

public class SafetyDepositBoxes {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var items = scanner.nextLine();
        final var lookingFor = scanner.nextLine();

        final int itemsBeforeDesired = items
            .substring(0, items.indexOf(lookingFor))
            .replaceAll("[^,]", "").length();

        final int time = 5 + 5 * itemsBeforeDesired;

        System.out.print(time);
    }
}
