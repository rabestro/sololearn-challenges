import java.util.Scanner;

public class TheSpyLife
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var encoded = new StringBuilder(input.nextLine());
        var message = encoded.reverse().toString().replaceAll("[^a-zA-Z ]", "");
        
        System.out.print(message);
    }
}
