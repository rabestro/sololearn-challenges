import java.util.Scanner;

public class FruitBowl
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var fruit = input.nextInt();
        input.close();

        int apples = fruit / 2;
        int pies = apples / 3; 
        
        System.out.print(pies);
    }
}
