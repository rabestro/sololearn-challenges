public class IzzyIguana {

    public static void main(String[] args) {
            
        System.out.println(new java.util.Scanner(System.in)
            .tokens()
            .mapToInt(java.util.Map.of("Lettuce", 5, "Carrot", 4, "Mango", 9, "Cheeseburger", 0)::get)
            .sum() >= 10 ? "Come on Down!" : "Time to wait");
    }
}
