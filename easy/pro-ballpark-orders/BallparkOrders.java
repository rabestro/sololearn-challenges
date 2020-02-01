import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;

public class BallparkOrders {
    public static void main(String[] args) {
        
        final Map<String, Integer> menu = Map.of(
            "Nachos", 6, "Pizza", 6, "Cheeseburger", 10, "Water", 4, "Coke", 5);
            
        final var tax = new BigDecimal("1.07");
        final var sum = new Scanner(System.in)
            .tokens()
            .mapToInt(item -> menu.get(menu.containsKey(item) ? item : "Coke"))
            .sum();
            
        final var totalCost = new BigDecimal(sum).multiply(tax);
        
        System.out.print(totalCost.setScale(2));
    }
}
