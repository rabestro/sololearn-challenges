import java.util.Scanner;

public class Map2D {
    public final static int SIZE = 5 + 1; // Size of square + comma
    
    public static void main(String[] args) {
        var map = new Scanner(System.in).nextLine();
        
        int indexA = map.indexOf('P');
        int indexB = map.indexOf('P', indexA + 1);
        
        int path = indexB / SIZE - indexA / SIZE + Math.abs(indexA % SIZE - indexB % SIZE);
        
        System.out.print(path);
    }
}
