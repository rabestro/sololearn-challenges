import java.util.Scanner;

public class FruitBowl
{
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int fruit = input.nextInt();
        input.close();
        
        //your code goes here
        
        final int apples = fruit / 2;
        final int pies = apples / 3; 
        
        System.out.print(pies);
    }
}
