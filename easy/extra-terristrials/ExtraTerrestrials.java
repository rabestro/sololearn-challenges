import java.util.Scanner;

public class ExtraTerrestrials
{
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var word = new StringBuilder(in.nextLine());
        in.close();
        
        System.out.print(word.reverse());
    }
}
