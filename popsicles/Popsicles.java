import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int siblings = input.nextInt();
        int popsicles = input.nextInt();
        
        //your code goes here
        
        final boolean isEvenAmount = popsicles % siblings == 0;
        
        if (isEvenAmount) {
            System.out.print("give away");
        }
        else {
            System.out.print("eat them yourself");
        }
    }
}
