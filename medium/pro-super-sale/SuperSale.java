import java.util.Scanner;

public class SuperSale {
    public static void main(String[] args) {
        final var in = new Scanner(System.in).useDelimiter(",");
        float item, max = 0, sum = 0;
        
        while (in.hasNextFloat()) {
        	item = in.nextFloat();
        	if (item > max) max = item;
        	sum += item;
        }
        final int totalSavings = (int) (0.3 * 1.07 * (sum - max));
        
        System.out.print(totalSavings);
    }
}
