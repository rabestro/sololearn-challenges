import java.util.Scanner;
import java.util.regex.Pattern;

public class DejaVu
{
    public static void main(String[] args) {
	    
       System.out.println(
           Pattern.matches(".*(.).*\\1.*", new Scanner(System.in).nextLine()) 
           ? "Deja Vu" : "Unique");
    }
}
