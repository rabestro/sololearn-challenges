public final class GuardFlamingos {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var yardLength = scanner.nextInt();
        final var yardWidth = scanner.nextInt();
        
        final var flamingos = yardLength + yardWidth;
	    
        System.out.print(flamingos);
    }
}
