import java.util.Scanner;

public class Hovercraft
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int sales = input.nextInt();
        
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
