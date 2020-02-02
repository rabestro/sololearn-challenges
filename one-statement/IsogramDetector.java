public class IsogramDetector {

	public static void main(String[] args) {
	    
	    System.out.println(!java.util.regex.Pattern
	        .matches(".*(.).*\\1.*", new java.util.Scanner(System.in).nextLine()));
	}
}
