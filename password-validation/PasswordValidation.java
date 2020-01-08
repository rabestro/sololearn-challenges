import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var password = input.nextLine();
	    
        boolean isStrong = password.length() > 6
           && Pattern.matches(".*\\d.*\\d.*", password)
           && Pattern.matches("(.*[!@#$%&*].*){2,}", password);
	        
        System.out.println(isStrong ? "Strong" : "Weak");
    }
}
