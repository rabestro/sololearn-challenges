import java.util.Scanner;

public class Argentina
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesos = input.nextInt();
        int dollars = input.nextInt();
        input.close();
        
        System.out.print(dollars * 50l > pesos ? "Pesos" : "Dollars");
    }
}
