import java.util.Scanner;

public final class Neverland {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var yourAge = scanner.nextInt();
        final var years = scanner.nextInt();
        
        System.out.printf(
            "My twin is %d years old and they are %d years older than me", 
            yourAge + years, years);
    }
}
