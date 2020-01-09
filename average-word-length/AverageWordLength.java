import java.util.Scanner;

public class AverageWordLength
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var essay = input.nextLine();
        final int words = essay.split(" ").length;
        final int chars = essay.replaceAll("[^a-zA-Z]", "").length();
        
        final int average = (int) java.lang.Math.ceil((double) chars / words);
        
        System.out.print(average);
    }
}
