import java.util.Scanner;

public final class PasswordValidation {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var password = scanner.nextLine();
	    
        final var isStrong = password.length() > 6
           && password.matches(".*\\d.*\\d.*")
           && password.matches("(.*[!@#$%&*].*){2,}");
	        
        System.out.println(isStrong ? "Strong" : "Weak");
    }
}
