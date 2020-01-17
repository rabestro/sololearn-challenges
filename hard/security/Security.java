import java.util.Scanner;
import java.util.regex.Pattern;

public class Security
{
    final static String GUARD_BETWEEN_THIEF_AND_MONEY = ".*[$T].*G.*[$T].*";
    
    public static void main(String[] args) {
	    final var input = new Scanner(System.in);
	    final var floor = input.nextLine();
	    input.close();
	    
	    boolean isSafe = Pattern.matches(GUARD_BETWEEN_THIEF_AND_MONEY, floor);
	        
       System.out.println(isSafe ? "quiet" : "ALARM");
	}
}

