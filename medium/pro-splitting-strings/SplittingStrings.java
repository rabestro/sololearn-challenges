import java.util.Scanner;

public final class SplittingStrings {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var s = scanner.nextLine();
        final var n = scanner.nextInt();
        
        final var separated = String.join("-", s.split(String.format("(?<=\\G.{%d})", n)));
        System.out.print(separated);
   }
}
