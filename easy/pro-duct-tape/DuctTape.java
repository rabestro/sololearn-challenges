public class DuctTape {
	public static void main(String[] args) { 
		
	    final var in = new java.util.Scanner(System.in);
	    final var doorHeight = in.nextInt();
	    final var doorWidth = in.nextInt();
            in.close();
			
	    final var rollSquare = 10; // 60ft long * 2" / 12" width
	    final var doorSquare = 2 * doorHeight * doorWidth; // Both sides of the door!
	    final var rollsRequired = (int) Math.ceil((double) doorSquare / rollSquare);
	    
	    System.out.print(rollsRequired);
	}
}
