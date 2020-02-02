public class Divisible {
    public static void main(String[] args) {
           
        System.out.print(
            new java.util.Scanner(System.in)
                .useDelimiter("\\s")
                .tokens()
                .mapToInt(Integer::parseInt)
                .reduce((a, b) -> a = a % b == 0 ? a : 0)
                .orElse(0) > 0
                ? "divisible by all" : "not divisible by all");
    }
}
