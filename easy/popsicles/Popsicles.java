import java.util.Scanner;

public class Popsicles {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);
        final var siblings = input.nextInt();
        final var popsicles = input.nextInt();
        input.close();
        
        final var isEvenAmount = popsicles % siblings == 0;
        
        if (isEvenAmount) {
            System.out.print("give away");
        } else {
            System.out.print("eat them yourself");
        }
    }
}
