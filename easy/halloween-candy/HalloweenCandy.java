import java.util.Scanner;
import static java.lang.Math.ceil;

public class HalloweenCandy {
    public static void main(final String[] args) {
        
        final var in = new Scanner(System.in);
        final var houses = in.nextInt();
        in.close();
        
        final var percentage = (int) ceil(200. / houses);
       
        System.out.print(percentage);
    }
}
