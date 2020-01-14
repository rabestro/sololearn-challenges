import java.util.regex.Pattern;

public class Program
{
   final static String IS_COLOR = "1?.(.)( 1?.\\1){4}";
   
	public static void main(String[] args) {
	    final var input = new java.util.Scanner(System.in);
	    final var pokerHand = input.nextLine();
	    
	    boolean isColor = Pattern.matches(IS_COLOR, pokerHand);
	    
	}
	
	static int getValue (String card) {
  switch (input)
  {
   case "2": return 0;
   case "3": return 1;
   case "4": return 2;
   case "5": return 3;
   case "6": return 4;
   case "7": return 5;
   case "8": return 6;
   case "9": return 7;
   case "10": return 8;
   case "J": return 9;
   case "Q": return 10;
   case "K": return 11;
   case "A": return 12;
  }
  return -1;
 }
 }
}
