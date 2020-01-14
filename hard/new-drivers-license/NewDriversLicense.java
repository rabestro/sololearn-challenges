import java.util.Scanner;

public class NewDriversLicense
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var hero = input.next();
        final var agents = input.nextInt();
        
        int position = 0;
        
        while(input.hasNext()) {
            var person = input.next();
            if (hero.compareTo(person) > 0) {
                ++position;
            }
        }
        final int time = 20 * (1 + position / agents);
        
        System.out.print(time);
    }
}
