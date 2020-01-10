import java.util.Scanner;

public class HalloweenCandy
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int houses = input.nextInt();
        final int percentage = (int) java.lang.Math.ceil(200. / houses);
       
        System.out.print(percentage);
    }
}
