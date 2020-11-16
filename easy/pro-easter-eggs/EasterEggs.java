public final class EasterEggs {
    public static void main(final String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        
        final var totalNumberEggs = scanner.nextInt();
        final var yourAmount = scanner.nextInt();
        final var friendsAmount = scanner.nextInt();
        
        final var isStillEggs = totalNumberEggs > yourAmount + friendsAmount;
        
        System.out.println(
            isStillEggs ? "Keep Hunting" : "Candy Time"
        );
    }
}
