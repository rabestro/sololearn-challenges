import java.util.Scanner;

public class NoNumerals
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var phrase = input.nextLine();
        final String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        final var updatedPhrase = new StringBuilder();
        
        for (var word : phrase.split(" ")) {
            try {
                int number = Integer.parseInt(word);
                if (number >= 0 && number <= 10) {
                	updatedPhrase.append(numbers[number]);
                } else {
                	updatedPhrase.append(word);
                }
            } catch (NumberFormatException nfe) {
                updatedPhrase.append(word);
            }
            updatedPhrase.append(" ");
        }
        System.out.print(updatedPhrase);
    }
}
