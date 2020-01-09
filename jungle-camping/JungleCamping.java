import java.util.Scanner;
import java.util.Map;

public class JungleCamping
{
    public static void main(String[] args) {
        Map<String, String> animals = Map.of(
            "Grr","Lion", "Rawr", "Tiger", "Ssss", "Snake", "Chirp", "Bird");
	    
        final var input = new Scanner(System.in);
        final var noise = input.nextLine().split(" ");
        
        for (var sound : noise) {
            System.out.printf("%s ", animals.get(sound));
        }
    }
}
