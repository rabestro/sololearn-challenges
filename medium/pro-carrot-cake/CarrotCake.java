import java.util.Scanner;

public class CarrotCake {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);
        final var carrotsForCake = 7;
        final var carrots = input.nextInt();
        final var boxes = input.nextInt();
        input.close();
        
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
