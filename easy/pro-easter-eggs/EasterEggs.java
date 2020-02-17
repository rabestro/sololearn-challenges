public class EasterEggs {
    public static void main(final String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var totalNumberEggs = input.nextInt();
        final var yourAmount = input.nextInt();
        final var friendsAmount = input.nextInt();
        input.close();
        
        final var isStillEggs = totalNumberEggs > yourAmount + friendsAmount;
        
        System.out.print(isStillEggs ? "Keep Hunting" : "Candy Time");
    }
}
