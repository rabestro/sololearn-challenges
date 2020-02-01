import java.util.Scanner;

public class TheSpyLife {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);
        final var encoded = new StringBuilder(input.nextLine());
        input.close();
        
        final var message = encoded.reverse().toString().replaceAll("[^a-zA-Z ]", "");
        
        System.out.print(message);
    }
}
