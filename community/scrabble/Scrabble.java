/*
    Scramble: https://www.sololearn.com/learn/4499/
    
    Input: variable number of words separated by space.
    Output: the word with the maximum Scrabble score
*/
import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Comparator;

public class Scrabble {

	public static int wordValue(final String word) {
		// a b c d e f g h i j k l m n o p q r s t u v w x y z
		final int[] charValue = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 
			5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		
		return word.toLowerCase().chars().map(i -> charValue[i - 'a']).sum();
	}
	
	public static void main(final String[] args) {
		final var in = new Scanner(System.in);
		final var words = Arrays.stream(in.nextLine().split("\\s"));
		
		final var result = words.max(Comparator.comparing(Scrabble::wordValue)).get();
		
		System.out.println(result);
	}
}
