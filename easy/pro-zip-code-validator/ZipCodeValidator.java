import java.util.regex.Pattern;

public class ZipCodeValidator {
    public static void main(String[] args) {
	    
        final var input = new java.util.Scanner(System.in);
        final var zipCode = input.nextLine();
        input.close();
	    
        final var isValid = Pattern.matches("\\d{5}", zipCode);
	    
        System.out.println(isValid);
    }
}
