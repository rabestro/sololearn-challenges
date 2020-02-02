public class Security {
    
    public static void main(String[] args) {
	    
       System.out.println(java.util.regex.Pattern
           .matches(".*[$T].*G.*[$T].*", new java.util.Scanner(System.in).nextLine()) ? "quiet" : "ALARM");
    }
}
