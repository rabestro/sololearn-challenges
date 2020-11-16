public final class DuctTape {
	public static void main(String[] args) { 
	    final var scanner = new java.util.Scanner(System.in);
	    final var doorHeight = scanner.nextInt();
	    final var doorWidth = scanner.nextInt();
			
	    final var rollSquare = 10; // 60ft long * 2" / 12" width
	    final var doorSquare = 2 * doorHeight * doorWidth; // Both sides of the door!
	    final var rollsRequired = (int) Math.ceil((double) doorSquare / rollSquare);
	    
	    System.out.print(rollsRequired);
	}
}
