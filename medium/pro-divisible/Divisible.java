public final class Divisible {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var number = scanner.nextInt();
        final var isDivisible = scanner.tokens().mapToInt(Integer::parseInt).allMatch(i -> number % i == 0); 
           
        System.out.println(isDivisible ? "divisible by all" : "not divisible by all");
    }
}
