import java.util.Scanner;

public class Symbols
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var text = input.nextLine();
        input.close();
        
        final var message = text.replaceAll("[^a-zA-Z0-9 ]", "");
        
        System.out.print(message);
    }
}
