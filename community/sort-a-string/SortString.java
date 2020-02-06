/*
  Given a string as input, output its characters alphabetically sorted from A to Z.
  Whitespaces should be ignored.
*/

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        final var in = new Scanner(System.in);
        final var string = in.nextLine();

        final var temp = string.replaceAll("\\s", "").toCharArray();
        Arrays.sort(temp);

        final var sortedString = new String(temp);
        System.out.println(sortedString);
    }
}
