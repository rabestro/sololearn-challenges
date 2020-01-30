public class DuctTape {
	public static void main(String[] args) { 
	    System.out.print( 
	        new java.util.Scanner(System.in)
                .tokens()
                .mapToInt(Integer::parseInt)   
                .reduce((doorHeight, doorWidth) -> (int) Math.ceil(doorHeight * doorWidth / 5.))
                .orElse(1)
        );
    }
}
