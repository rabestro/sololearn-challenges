import java.util.Scanner;
import static java.lang.Math.ceil;

public class AverageWordLength {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var essay = input.nextLine();
        final var wordsCount = essay.split("\\W").length;
        final var charsCount = essay.replaceAll("\\W", "").length();

        final var average = (int) ceil((double) charsCount / wordsCount);

        System.out.print(average);
    }
}
