import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yards = input.nextInt();

        if (yards > 10) 
            System.out.print("High Five");
        else if (yards < 1) 
            System.out.print("shh");
        else while (yards-- > 0) 
            System.out.print("Ra!");
    }
}
