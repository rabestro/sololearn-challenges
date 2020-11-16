import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class PaintCosts {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numberOfColors = scanner.nextInt();

        final var brushesCost = new BigDecimal(40);
        final var colorsCost = new BigDecimal(5 * numberOfColors);
        final var price = brushesCost.add(colorsCost);
        
        final var tax = new BigDecimal("1.01");
        final var totalCost = tax.multiply(price);
        
        System.out.print(totalCost.setScale(0, RoundingMode.HALF_EVEN));
   }
}
