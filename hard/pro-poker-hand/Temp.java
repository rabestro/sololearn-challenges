import java.util.regex.Pattern;

public class Temp
{
   final static String IS_COLOR = "1?.(.)( 1?.\\1){4}";
   
	public static void main(String[] args) {
	    final var input = new java.util.Scanner(System.in);
	    final var pokerHand = input.nextLine();
	    
	    boolean isColor = Pattern.matches(IS_COLOR, pokerHand);
	    
	}
	
  static int getCardValue (String card) {
    switch (card) {
      case "2": return 2;
      case "3": return 3;
      case "4": return 4;
      case "5": return 5;
      case "6": return 6;
      case "7": return 7;
      case "8": return 8;
      case "9": return 9;
      case "10": return 10;
      case "J": return 11;
      case "Q": return 12;
      case "K": return 13;
      case "A": return 14;
    }
    return -1;
  }
}