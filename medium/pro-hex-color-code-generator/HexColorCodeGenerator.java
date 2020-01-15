public class HexColorCodeGenerator
{
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final int red = input.nextInt();
        final int green = input.nextInt();
        final int blue = input.nextInt();
        input.close();
        
        System.out.printf("#%02x%02x%02x", red, green, blue);
    }
}
