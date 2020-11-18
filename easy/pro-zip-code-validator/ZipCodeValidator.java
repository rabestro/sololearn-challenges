import java.util.regex.Pattern;

public class ZipCodeValidator {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var zipCode = scanner.nextLine();
	    
        final var isValid = Pattern.matches("\\d{5}", zipCode);
        System.out.println(isValid);
    }
}
