import java.util.Scanner;

public class CheerCreator
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final int yards = input.nextInt();
        input.close();
        
        if (yards > 10) {
            System.out.print("High Five");
        } else if (yards < 1) {
            System.out.print("shh");
        } else {
            System.out.print("Ra!".repeat(yards));
        }
    }
}
