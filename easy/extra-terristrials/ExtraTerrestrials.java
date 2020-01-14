import java.util.Scanner;

public class ExtraTerrestrials
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var word = new StringBuilder(input.nextLine());
        
        System.out.print(word.reverse());
    }
}
