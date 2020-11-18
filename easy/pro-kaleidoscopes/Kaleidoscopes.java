import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kaleidoscopes {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        final var kaleidoscopes = scanner.nextInt();
        
        final var discount = 0.9;
        final var tax = 1.07;
        
        var price = kaleidoscopes * 5.0;
        
        if (kaleidoscopes > 1) {
        	price *= discount;
        }
        price *= tax;
        
        System.out.printf("%.2f", 
            new BigDecimal(price).setScale(2, RoundingMode.HALF_EVEN));
    }
}
