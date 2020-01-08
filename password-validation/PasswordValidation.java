import java.util.regex.Pattern;
import java.util.Scanner;

public class Program
{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String password = input.nextLine();
      boolean isStrong = false;
      validation: {
          if (password.length() < 7) break validation;
          if (!Pattern.matches(".*\\d.*\\d.*", password)) break validation;
          isStrong = Pattern.matches(".*[!@#$%&*].*[!@#$%&*].*", password);
      }
      System.out.println(isStrong ? "Strong" : "Weak");
  }
}
