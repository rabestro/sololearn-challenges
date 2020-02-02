public class Popsicles {
    public static void main(String[] args) {
        
        System.out.print(
            0 == new java.util.Scanner(System.in)
                .tokens()
                .mapToInt(Integer::parseInt)   
                .reduce((siblings, popsicles) -> popsicles % siblings)
                .orElse(1) ? "give away" : "eat them yourself"
        );
    }
}
