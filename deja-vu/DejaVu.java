import java.util.Scanner;
import java.util.regex.Pattern;

public class DejaVu
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var text = input.nextLine();
	    
        boolean isDejaVu = Pattern.matches(".*(.).*\\1.*", text);
        System.out.println(isDejaVu ? "Deja Vu" : "Unique");
   }
}
