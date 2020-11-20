import java.util.Scanner;

public final class CarrotCake {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var carrotsForCake = 7;
        final var carrots = scanner.nextInt();
        final var boxes = scanner.nextInt();
        
        final var leftOverCarrots = carrots % boxes;
        final var isEnoughForCake = leftOverCarrots >= carrotsForCake;
        
        if (isEnoughForCake) {
            System.out.print("Cake Time");
        } else {
            final var needMoreCarrots = carrotsForCake - leftOverCarrots;
            System.out.printf("I need to buy %d more", needMoreCarrots);
        }
    }
}
