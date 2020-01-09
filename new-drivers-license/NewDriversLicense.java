import java.util.Scanner;

public class NewDriversLicense
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final String hero = input.nextLine();
        final int agents = input.nextInt();
        input.nextLine(); // Chomp new line symbol after nextInt();
        final String[] persons = input.nextLine().split(" ");      
        
        int position = 0;
        
        for (String person : persons) {
            if (hero.compareTo(person) > 0) {
                ++position;
            }
        }
        final int time = 20 * (1 + position / agents);
        
        System.out.print(time);
    }
}
