import java.util.Scanner;
import java.util.stream.Stream;

public class PigLatin {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        
        Stream.generate(input::next)
            .map(word -> word.substring(1) + word.charAt(0) + "ay ")
            .forEach(System.out::print);
    }
}
