import java.util.Scanner;
import static java.lang.Math.round;

public class PaintCosts
{
    public static void main(String[] args) {
        final var in = new Scanner(System.in);
        final var colors = in.nextInt();
        in.close();

        final var brushesCost = 40;
        final var colorsCost = 5 * colors;
        final var tax = 0.1;
        final var totalCost = (int) round((1 + tax) * (colorsCost + brushesCost));
        
        System.out.print(totalCost);
   }
}
