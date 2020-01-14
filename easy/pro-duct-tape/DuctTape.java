public class DuctTape
{
	public static void main(String[] args) { 
	    final var input = new java.util.Scanner(System.in);
	    final int doorHeight = input.nextInt();
	    final int doorWidth = input.nextInt();
	    
	    final int rollSquare = 10; // 60ft long * 2" / 12" width
	    final int doorSquare = 2 * doorHeight * doorWidth; // Both sides of the door!
	    final int rollsRequired = (int) Math.ceil((double) doorSquare / rollSquare);
	    
	    System.out.print(rollsRequired);
	}
}
