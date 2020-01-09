import java.util.Scanner;

public class NewDriversLicense
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final String hero = input.next();
        final int agents = input.nextInt();
        
        int position = 0;
        
        while(input.hasNext()) {
            final String person = input.next();
            if (hero.compareTo(person) > 0) {
                ++position;
            }
        }
        final int time = 20 * (1 + position / agents);
        
        System.out.print(time);
    }
}
