import java.util.Scanner;

public class Neverland {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);
        final var yourAge = input.nextInt();
        final var years = input.nextInt();
        input.close();
        
        System.out.printf("My twin is %d years old and they are %d years older than me", yourAge + years, years);
    }
}
