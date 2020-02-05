import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {

        new Scanner(System.in)
                .nextLine()
                .toLowerCase()
                .chars()
                .forEach(i -> {
                    char encoded = (char) (i >= 'a' && i <= 'z' ? 'a' + 'z' - i : i);
                    System.out.print(encoded);
                });
    }
}
