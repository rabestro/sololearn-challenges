public class GuardFlamingos {
    public static void main(String[] args) {
	    
        System.out.print(
	        new java.util.Scanner(System.in)
	            .tokens()
	            .limit(2)
	            .mapToInt(Integer::parseInt)
	            .reduce(Integer::sum)
	            .getAsInt());
    }
}
