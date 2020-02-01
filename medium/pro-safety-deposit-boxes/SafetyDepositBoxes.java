import java.util.Scanner;

public class SafetyDepositBoxes {
    public final static int SIZE = 5 + 1; // Size of square + comma
    
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var items = input.nextLine();
        final var lookingFor = input.nextLine();
        input.close();
        
        final int itemsBeforeDesired = items.substring(0, items.indexOf(lookingFor))
            .replaceAll("[^,]", "").length();
        
        final int time = 5 + 5 * itemsBeforeDesired;
       
        System.out.print(time);
    }
}
