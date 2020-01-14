import java.util.Scanner;
import java.util.regex.Pattern;

public class DejaVu
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var text = input.nextLine();
	    
        final boolean isDejaVu = Pattern.matches(".*(.).*\\1.*", text);
	    
        System.out.println(isDejaVu ? "Deja Vu" : "Unique");
   }
}
