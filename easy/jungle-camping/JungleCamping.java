import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class JungleCamping
{
    public static void main(String[] args) {
	    final var in = new Scanner(System.in);
	    final Map<String, String> animals = Map.of(
            "Grr", "Lion ", "Rawr", "Tiger ", "Ssss", "Snake ", "Chirp", "Bird ");
            
	    Stream.generate(in::next)
            .map(animals::get)
            .forEach(System.out::print);
    }
}
