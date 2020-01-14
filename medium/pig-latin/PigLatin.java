import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var sentence = input.nextLine().split(" ");
        
        for (var word : sentence) {
            System.out.printf("%s%cay ", word.substring(1), word.charAt(0));
        }
    }
}
