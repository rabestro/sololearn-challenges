import java.util.Scanner;

public class AverageWordLength
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var essay = input.nextLine();
        final var words = essay.split(" ").length;
        final var chars = essay.replaceAll("\\W", "").length();
        
        final var average = (int) java.lang.Math.ceil((double) chars / words);
        
        System.out.print(average);
    }
}
