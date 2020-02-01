import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var password = input.nextLine();
        input.close();
        
        final var isStrong = password.length() > 6
           && Pattern.matches(".*\\d.*\\d.*", password)
           && Pattern.matches("(.*[!@#$%&*].*){2,}", password);
	        
        System.out.println(isStrong ? "Strong" : "Weak");
    }
}
