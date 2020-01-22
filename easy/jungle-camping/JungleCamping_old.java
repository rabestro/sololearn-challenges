import java.util.Scanner;
import java.util.Map;

public class JungleCamping_old
{
    public static void main(final String[] args) {
        final Map<String, String> animals = Map.of("Grr", "Lion", "Rawr", "Tiger", "Ssss", "Snake", "Chirp", "Bird");

        final var in = new Scanner(System.in);
        final var noise = in.nextLine().split(" ");
        in.close();

        for (final var sound : noise) {
            System.out.printf("%s ", animals.get(sound));
        }
    }
}
