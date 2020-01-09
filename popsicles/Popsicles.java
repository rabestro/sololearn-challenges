import java.util.Scanner;

public class Popsicles
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int siblings = input.nextInt();
        final int popsicles = input.nextInt();
        final boolean isEvenAmount = popsicles % siblings == 0;
        
        if (isEvenAmount) {
            System.out.print("give away");
        } else {
            System.out.print("eat them yourself");
        }
    }
}
