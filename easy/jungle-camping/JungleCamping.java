import java.util.*;

public class JungleCamping
{
    public static void main(String[] args) {
        Map<String, String> animals = Map.of(
            "Grr", "Lion ", "Rawr", "Tiger ", "Ssss", "Snake ", "Chirp", "Bird ");
	    
        Arrays.stream(new Scanner(System.in).nextLine().split(" "))
            .map(animals::get)
            .forEach(System.out::print);
    }
}
