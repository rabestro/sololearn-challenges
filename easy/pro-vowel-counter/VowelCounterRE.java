import java.util.Scanner;

public class VowelCounterRE
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var sentence = input.nextLine();
        input.close();
        
        final var vowels = sentence.replaceAll("[^AEIOUaeiou]", "").length();
        
        System.out.println(vowels);
    }
}
