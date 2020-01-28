public class EasterEggs {
	
    public static void main(String[] args) {
	    
        System.out.println(
	        new java.util.Scanner(System.in)
	            .tokens()
	            .limit(3)
	            .mapToInt(Integer::parseInt)
	            .reduce((a,b) -> a = a - b)
	            .orElse(0) > 0 ? "Keep Hunting" : "Candy Time");
    }
}
