public class ZipCodeValidator {

	public static void main(String[] args) {
	    
	    System.out.println(java.util.regex.Pattern
	        .matches("\\d{5}", new java.util.Scanner(System.in).nextLine()));
	}
}
