public final class TheSpyLife {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var encoded = new StringBuilder(scanner.nextLine());
        final var message = encoded.reverse().toString().replaceAll("[^a-zA-Z ]", "");
        
        System.out.print(message);
    }
}
