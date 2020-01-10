// ./Playground/Program.java:9: error: switch rules are a preview feature and are disabled by default.

import java.util.Scanner;

public class ConvertDate
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);

        input.findInLine("(.*)[ /](\\d{1,2})[,/] ?(\\d{4})");
        final var usDate = input.match();
        
        final int month = 
            switch (usDate.group(1)) {
           	   case "January" -> 1;
           	   case "February" -> 2;
           	   case "March" -> 3;
           	   case "April" -> 4;
           	   case "May" -> 5;
           	   case "June" -> 6;
           	   case "July" -> 7;
           	   case "August" -> 8;
           	   case "September" -> 9;
           	   case "October" -> 10;
           	   case "November" -> 11;
           	   case "December" -> 12;
           	   default -> Integer.valueOf(usDate.group(1));
            };
        final var day = usDate.group(2);
        final var year = usDate.group(3);
        
        System.out.printf("%s/%d/%s", day, month, year);
    }
}
