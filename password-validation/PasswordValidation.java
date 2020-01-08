import java.util.Scanner;
import java.util.regex.Pattern;

public class Program
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String password = input.nextLine();
	    
	    boolean isStrong = password.length() > 6
	        && Pattern.matches(".*\\d.*\\d.*", password)) 
	        && Pattern.matches("(.*[!@#$%&*].*){2,}", password);
	        
       System.out.println(isStrong ? "Strong" : "Weak");
	}
}
