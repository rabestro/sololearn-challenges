import java.util.Map;
import java.util.Scanner;

public class BallparkOrders
{
    public static void main(String[] args) {
        
        final Map<String, Integer> menu = Map.of(
            "Nachos", 6, "Pizza", 6, "Cheeseburger", 10, "Water", 4, "Coke", 5);
            
        double tax = 1 + 0.07;
        double totalCost = tax * new Scanner(System.in).tokens()
            .mapToDouble(item -> menu.get(menu.containsKey(item) ? item : "Coke"))
            .sum();
            
        System.out.printf("%.2f", totalCost);
    }
}
