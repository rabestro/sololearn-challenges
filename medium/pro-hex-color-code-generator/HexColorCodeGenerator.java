public final class HexColorCodeGenerator {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var red = scanner.nextInt();
        final var green = scanner.nextInt();
        final var blue = scanner.nextInt();
        
        System.out.printf("#%02x%02x%02x", red, green, blue);
    }
}
