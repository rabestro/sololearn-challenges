import java.util.Scanner;

public final class Popsicles {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var siblings = scanner.nextInt();
        final var popsicles = scanner.nextInt();
        
        final var isEvenAmount = popsicles % siblings == 0;
        
        System.out.println(
            isEvenAmount ? "give away" : "eat them yourself"
        );
    }
}
