import java.util.Scanner;
import java.util.Map;

public class JungleCamping
{
    public static void main(String[] args) {
        Map<String, String> animals = Map.of(
            "Grr", "Lion", "Rawr", "Tiger", "Ssss", "Snake", "Chirp", "Bird");
	    
        final var in = new Scanner(System.in);
        final var noise = in.nextLine().split(" ");
        in.close();
        
        for (var sound : noise) {
            System.out.printf("%s ", animals.get(sound));
        }
    }
}
