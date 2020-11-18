import java.util.Map;
import java.util.Scanner;

public class JungleCamping {
    public static void main(String[] args) {
        final var animals = Map.of(
            "Grr", "Lion ", "Rawr", "Tiger ", "Ssss", "Snake ", "Chirp", "Bird ");
          
        new Scanner(System.in).tokens().map(animals::get).forEach(System.out::print);
    }
}
