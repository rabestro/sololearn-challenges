import java.util.Scanner;

public class Symbols
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var text = input.nextLine();
        var message = text.replaceAll("[^a-zA-Z0-9 ]", "");
        
        System.out.print(message);
    }
}
