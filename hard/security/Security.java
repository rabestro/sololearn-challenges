import java.util.Scanner;

public class Security {
    public static void main(final String[] args) {
        var floor = new Scanner(System.in).nextLine();
        var isSafe = floor.matches(".*[$T].*G.*[$T].*");

        System.out.println(isSafe ? "quiet" : "ALARM");
    }
}
