import java.util.Scanner;

public class ExtraTerrestrials {
    public static void main(final String[] args) {
        
        final var in = new Scanner(System.in);
        final var word = new StringBuilder(in.nextLine());
        in.close();
        
        System.out.print(word.reverse());
    }
}
