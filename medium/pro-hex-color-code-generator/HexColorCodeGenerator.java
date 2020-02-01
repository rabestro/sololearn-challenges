public class HexColorCodeGenerator {
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var red = input.nextInt();
        final var green = input.nextInt();
        final var blue = input.nextInt();
        input.close();
        
        System.out.printf("#%02x%02x%02x", red, green, blue);
    }
}
