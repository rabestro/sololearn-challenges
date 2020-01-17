import java.util.Scanner;

public class CheerCreator
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        int yards = input.nextInt();
        input.close();
        
        if (yards > 10) {
        	  System.out.print("High Five");
        } else if (yards < 1) {
        	  System.out.print("shh");
        } else {
            while (yards-- > 0) {
                System.out.print("Ra!");
            }
        }
    }
}
