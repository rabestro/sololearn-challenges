import java.util.Scanner;

public class PigLatin_old
{
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var sentence = input.nextLine().split(" ");

        for (final var word : sentence) {
            System.out.printf("%s%cay ", word.substring(1), word.charAt(0));
        }
    }
}
