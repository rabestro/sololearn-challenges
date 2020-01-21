import java.util.Scanner;

public class SecretMessage
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var message = input.nextLine();
        
        message.toLowerCase().chars().forEach(i -> {
            char encoded = (char)(i >= 'a' && i <= 'z' ? 'a' + 'z' - i : i);
            System.out.print(encoded); });
    }
}
