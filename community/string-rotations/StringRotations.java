import java.util.Scanner;
import java.util.Arrays;

public class StringRotations {

    public static String shiftWord(String word) {
        return word.substring(1) + word.charAt(0);
    }
    
    public static void main(final String[] args) {
        
        final var in = new Scanner(System.in);
        final var word = in.next();
        in.close();
        
        final String[] rotations = new String[word.length()];
        
        String next = word;
        for (int i = 0; i < word.length(); ++i) {
            next = shiftWord(next);
            rotations[i] = next;
        }
        
        System.out.print(Arrays.toString(rotations));
    }
}
