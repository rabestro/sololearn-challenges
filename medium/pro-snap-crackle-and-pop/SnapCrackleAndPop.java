import java.util.Scanner;

public class SnapCrackleAndPop {
    public static void main(String[] args) {
        final var in = new java.util.Scanner(System.in);
    
        while(in.hasNextInt()) {
        	final int i = in.nextInt();
        	System.out.print(i % 3 > 0 ? i % 2 > 0 ? "Snap " : "Crackle " : "Pop ");
        }
    }
}
