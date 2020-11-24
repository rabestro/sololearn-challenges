/* 
Task: 
Given a color in CMYK format, output the corresponding RGB color. 

Input Format:
4 decimal numbers in the range of [0, 1], representing Cyan, Magenta, Yellow and Black. 

Output Format:
A string, representing the corresponding RGB color, each component separated by commas.

Sample Input:
0.4
0.49
0.552
0.36

Sample Output: 
98,83,73
*/
import java.util.Scanner;
import static java.lang.Math.round;

/**
 * @author Jegors Čemisovs
 *
 * {@url https://github.com/rabestro/sololearn-challenges}
 */
public final class CmykToRgb {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        
        // I chose the float as the most suitable type
        final var cyan = scanner.nextFloat();
        final var magenta = scanner.nextFloat();
        final var yellow = scanner.nextFloat();
        final var black = scanner.nextFloat();
        
        // round(float) returns int type, so we no need force conversion 
        final int red = round(255 * (1-cyan) * (1-black));
        final int green = round(255 * (1-magenta) * (1-black));
        final int blue = round(255 * (1-yellow) * (1-black));
        
        System.out.printf("%d,%d,%d", red, green, blue);
    }
}
