import java.util.Scanner;

public class Map2D {
    public final static int SIZE = 5 + 1; // Size of square + comma
    
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var map = input.nextLine();
        input.close();
        
        final int indexA = map.indexOf('P');
        final int indexB = map.indexOf('P', indexA + 1);
        
        final int path = indexB / SIZE - indexA / SIZE + Math.abs(indexA % SIZE - indexB % SIZE);
        
        System.out.print(path);
    }
}
