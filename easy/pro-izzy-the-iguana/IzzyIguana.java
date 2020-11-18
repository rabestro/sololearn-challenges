import java.util.Map;
import java.util.Scanner;

public class IzzyIguana {
    public static void main(String[] args) {
        final var snackPoints = Map.of("Lettuce", 5, "Carrot", 4, "Mango", 9, "Cheeseburger", 0);
        final var sum = new Scanner(System.in).tokens().mapToInt(snackPoints::get).sum();
            
        System.out.println(sum >= 10 ? "Come on Down!" : "Time to wait");
    }
}
