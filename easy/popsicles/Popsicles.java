import java.util.Scanner;

public class Popsicles {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var siblings = scanner.nextInt();
        var popsicles = scanner.nextInt();
        
        var isEvenAmount = popsicles % siblings == 0;
        
        System.out.println(
            isEvenAmount ? "give away" : "eat them yourself"
        );
    }
}
