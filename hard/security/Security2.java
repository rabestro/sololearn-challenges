import java.util.Scanner;

public class Security {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var floor = input.nextLine();
        input.close();

        System.out.println(isSafe(floor) ? "quiet" : "ALARM");
    }

    static boolean isSafe(String floor) {
        int alarm = 0;
        for (char c : floor.toCharArray()) {
            if (c == 'G') {
                alarm = 0;
            } else if (c == '$' || c == 'T') {
                alarm++;
                if (alarm == 2)
                    return false;
            }
        }
        return true;
    }
}
