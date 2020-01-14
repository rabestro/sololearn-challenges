import java.util.Scanner;
import java.util.regex.Pattern;

public class Security
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var floor = input.nextLine();      
        var isSafe = Pattern.matches(".*[$T].*G.*[$T].*", floor);
	      
        System.out.println(isSafe ? "quiet" : "ALARM");
    }
}
