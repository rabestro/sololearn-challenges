import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kaleidoscopes_Fails {
    public static void main(final String[] args) {
        
        final var input = new Scanner(System.in);
        final var kaleidoscopes = input.nextInt();
        input.close();
        
        final var discount = 0.9;
        final var tax = 1.07;
        
        double price = kaleidoscopes * 5;
        
        if (kaleidoscopes > 1) {
        	price *= discount;
        }
        
        price *= tax;
        
        System.out.printf("%.2f", price); // One test fails
    }
}
