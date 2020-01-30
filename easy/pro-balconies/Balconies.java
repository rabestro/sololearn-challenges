/* 
Balconies

You are trying to determine which of two apartments has a larger balcony. 
Both balconies are rectangles, and you have the length and width, but you need the area.

Task 
Evaluate the area of two different balconies and determine which one is bigger.

Input Format 
Your inputs are two strings where the measurements for height and width are separated by a comma. 
The first one represents apartment A, the second represents apartment B.

Output Format: 
A string that says whether apartment A or apartment B has a larger balcony.

Sample Input 
'5,5'
'2,10'

Sample Output 
Apartment A
*/

import java.util.Scanner;

/**
 * @author Jegors Čemisovs
 *
 * {@link https://github.com/rabestro/sololearn-challenges}
 */
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
