import java.util.Scanner;

public class DejaVu {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var text = scanner.nextLine();
        final var isDejaVu = text.matches(".*(.).*\\1.*");

        System.out.println(isDejaVu ? "Deja Vu" : "Unique");
    }
}
