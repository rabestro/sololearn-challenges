import java.util.Scanner;

public class ExtraTerrestrials
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var word = new StringBuilder(input.nextLine());
        input.close();
        
        System.out.print(word.reverse());
    }
}
