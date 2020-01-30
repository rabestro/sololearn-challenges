import java.util.Scanner;

public class Balconies {
    public static void main(String[] args) {
    
        final var input   = new Scanner(System.in).useDelimiter("[\\v,]+");
        final int heightA = input.nextInt();
        final int widthA  = input.nextInt();
        final int heightB = input.nextInt();
        final int widthB  = input.nextInt();
        input.close();
        
        final int areaA = heightA * widthA;
        final int areaB = heightB * widthB;
        
        if (areaA > areaB) {
            System.out.print("Apartment A");
        } else {
            System.out.print("Apartment B");
        }
    }
}
