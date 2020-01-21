import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PokerHand 
{    
    final static String FLUSH = "1?.(.)( 1?.\\1){4}";
    final static String FOUR = ".?(.)\\1\\1\\1.?";
    final static String FULL1 = "(.)\\1\\1(.)\\2";
    final static String FULL2 = "(.)\\1(.)\\2\\2";
    final static String THREE = ".*(.)\\1\\1.*";
    final static String TWO_PAIRS = ".?(.)\\1.?(.)\\2.?";
    final static String ONE_PAIR = ".*(.)\\1.*";
    
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var pokerHand = input.nextLine();
        input.close();
      
        char[] cards = Arrays.stream(pokerHand
                .replaceAll("[SCDH]", "")
                .split(" "))
                .mapToInt(PokerHand::getCardValue)
                .sorted()
                .collect(StringBuilder::new, 
                        StringBuilder::appendCodePoint, 
                        StringBuilder::append)
                .toString().toCharArray();

        boolean isColor = Pattern.matches(FLUSH, pokerHand);
        boolean isOrder = cards[0] + 1 == cards[1] 
                && cards[1] + 1 == cards[2]
                && cards[2] + 1 == cards[3] 
                && cards[3] + 1 == cards[4]
                || cards[4] == '0' + 14     // Special «low» stright: A-2-3-4-5
                && cards[0] == '2' && cards[1] == '3' && cards[2] == '4' && cards[3] == '5';   

        String hand = new String(cards);
        String rank;
        if (isColor && isOrder && cards[0] == '0' + 10) {
            rank = "Royal Flush";
        } else if (isColor && isOrder) {
            rank = "Straight Flush";
        } else if (isColor) {
            rank = "Flush";
        } else if (isOrder) {
            rank = "Straight";
        } else if (Pattern.matches(FOUR, hand)) {
            rank = "Four of a Kind";
        } else if (Pattern.matches(FULL1, hand) || Pattern.matches(FULL2, hand)) {
            rank = "Full House";
        } else if (Pattern.matches(THREE, hand)) {
            rank = "Three of a Kind";
        } else if (Pattern.matches(TWO_PAIRS, hand)) {
            rank = "Two Pairs";
        } else if (Pattern.matches(ONE_PAIR, hand)) {
            rank = "One Pair";
        } else {
            rank = "High Card";
        }
        System.out.println(rank);
    }
    
    static char getCardValue (String card) {
        switch (card) {
            case "10": return '0' + 10;
            case "J": return '0' + 11;
            case "Q": return '0' + 12;
            case "K": return '0' + 13;
            case "A": return '0' + 14;
            default: return card.charAt(0);
        }
    }
}
