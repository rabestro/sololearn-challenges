import java.util.Scanner;

public class Hovercraft {
    public static void main(String[] args) {
        
        final var in = new Scanner(System.in);
        final var sales = in.nextInt();
        in.close();

        final long hovercraftMonth = 10;
        final long hovercraftCosts = 2_000_000;
        final long hovercraftPrice = 3_000_000;
        final long insuranceMonth = 1_000_000;
        final long spentMonth = hovercraftMonth * hovercraftCosts + insuranceMonth;
        final long incomeMonth = sales * hovercraftPrice;
        
        if (incomeMonth > spentMonth) {
            System.out.print("Profit");
        } else if (incomeMonth < spentMonth) {
            System.out.print("Loss");
        } else {
            System.out.print("Broke Even");
        }
    }
}
