import java.util.Scanner;

public class HalloweenCandy
{
    public static void main(final String[] args) {
        final var in = new Scanner(System.in);
        final int houses = in.nextInt();
        final int percentage = (int) java.lang.Math.ceil(200. / houses);
       
        System.out.print(percentage);
    }
}
