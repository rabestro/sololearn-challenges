import java.util.Scanner;

public class Symbols
{
    public static void main(String[] args) {
        
        var message = new Scanner(System.in)
            .nextLine()
            .replaceAll("[^a-zA-Z0-9 ]", "");
        
        System.out.print(message);
    }
}
