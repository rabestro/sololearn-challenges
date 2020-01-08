import java.util.Scanner;
import java.util.regex.Pattern;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String floor = input.nextLine();
	      
        boolean isSafe = Pattern.matches(".*[$T].*G.*[$T].*", floor);
	      
        System.out.println(isSafe ? "quiet" : "ALARM");
    }
}
