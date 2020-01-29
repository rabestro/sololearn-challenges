public class GuardFlamingos {
    public static void main(String[] args) {
    
        final var in = new java.util.Scanner(System.in);
        final int yardLength = in.nextInt();
        final int yardWidth = in.nextInt();
        in.close();
        
        final int flamingos = yardLength + yardWidth;
	    
        System.out.print(flamingos);
    }
}
