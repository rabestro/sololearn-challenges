import java.util.Scanner;

public class SplittingStrings
{
    public static void main(String[] args) {
        final var in = new Scanner(System.in);
        final var s = in.nextLine();
        final var n = in.nextInt();
	    
        final var separated = String.join("-", s.split(String.format("(?<=\\G.{%d})", n)));
            
        System.out.print(separated);
   }
}
