import java.util.Scanner;

public class SafetyDepositBoxesArrays
{
    public final static int SIZE = 5 + 1; // Size of square + comma
    
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var items = input.nextLine();
        final var lookingFor = input.nextLine();
        input.close();
        
        final int time = 5 + 5 * java.util.Arrays.asList(items.split(",")).indexOf(lookingFor);
       
        System.out.print(time);
    }
}
