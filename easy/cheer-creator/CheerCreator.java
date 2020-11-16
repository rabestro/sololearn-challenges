import java.util.Scanner;

public final class CheerCreator {
    public static void main(final String[] args) {
        final var yards = new Scanner(System.in).nextInt();
        
        if (yards > 10) {
            System.out.print("High Five");
        } else if (yards < 1) {
            System.out.print("shh");
        } else {
            System.out.print("Ra!".repeat(yards));
        }
    }
}
