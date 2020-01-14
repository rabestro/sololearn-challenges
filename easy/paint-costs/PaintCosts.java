import java.util.Scanner;
import java.lang.Math;

public class PaintCosts
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int brushesCost = 40;
        final int colors = input.nextInt();
        final int colorsCost = 5 * colors;
        final double tax = 0.1;
        final int totalCost = (int)Math.round((1 + tax) * (colorsCost + brushesCost));
        
        System.out.print(totalCost);
   }
}
