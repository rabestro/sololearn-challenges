import java.util.Scanner;

public class GothamCity
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int criminals = input.nextInt();
        
        if (criminals < 5) {
            System.out.print("I got this!");
        } else if (criminals < 11) {
        	  System.out.print("Help me Batman");
        } else {
        	  System.out.print("Good Luck out there!");
        }
    }
}
