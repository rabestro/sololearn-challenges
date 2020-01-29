import java.util.Scanner;

public class CheerCreator {
    public static void main(final String[] args) {
        
        final var in = new Scanner(System.in);
        final var yards = in.nextInt();
        in.close();
        
        if (yards > 10) {
            System.out.print("High Five");
        } else if (yards < 1) {
            System.out.print("shh");
        } else {
            System.out.print("Ra!".repeat(yards));
        }
    }
}
