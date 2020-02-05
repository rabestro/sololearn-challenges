import java.util.Scanner;

public class NoNumerals_old {
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var phrase = input.nextLine();
        final String[] numbers = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten"};
        final var updatedPhrase = new StringBuilder();

        for (final var word : phrase.split(" ")) {
            try {
                final int number = Integer.parseInt(word);
                if (number >= 0 && number <= 10) {
                    updatedPhrase.append(numbers[number]);
                } else {
                    updatedPhrase.append(word);
                }
            } catch (final NumberFormatException nfe) {
                updatedPhrase.append(word);
            }
            updatedPhrase.append(" ");
        }
        System.out.print(updatedPhrase);
    }
}
