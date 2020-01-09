import java.util.Scanner;
import java.lang.Math;

public class HalloweenCandy
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int houses = input.nextInt();
        final int percentage = (int) Math.ceil(200. / houses);
       
        System.out.print(percentage);
    }
}
