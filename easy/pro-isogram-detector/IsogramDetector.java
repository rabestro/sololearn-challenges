import java.util.Scanner;
import java.util.regex.Pattern;

public final class IsogramDetector {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
	final var word = input.next();
        
        final var isIsogram = !Pattern.matches(".*(.).*\\1.*", word);
        
        System.out.println(isIsogram);
    }
}
