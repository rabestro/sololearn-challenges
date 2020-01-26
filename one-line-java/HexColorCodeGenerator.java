public class HexColorCodeGenerator
{
    public static void main(String[] args) {
	    
        System.out.printf("#%02x%02x%02x", 
	        new java.util.Scanner(System.in)
	            .tokens()
	            .limit(3)
	            .mapToInt(Integer::parseInt)
	            .boxed()
	            .toArray());
    }
}

