/*
Hovercraft

You run a hovercraft factory. Your factory makes ten hovercrafts in a month. 
Given the number of customers you got that month, did you make a profit? 
It costs you 2,000,000 to build a hovercraft, and you are selling them for 3,000,000. 
You also pay 1,000,000 each month for insurance.

Task: 
Determine whether or not you made a profit based on how many of the ten hovercrafts 
you were able to sell that month.
 
Input Format: 
An integer that represents the sales that you made that month.

Output Format: 
A string that says 'Profit', 'Loss', or 'Broke Even'.

Sample Input: 
5

Sample Output: 
Loss
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Jegors Čemisovs
 *
 * {@link https://github.com/rabestro/sololearn-challenges}
 */
public class Hovercraft {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var sales = scanner.nextBigDecimal();
        
        final var hovercraftMonth = new BigDecimal(10);
        final var hovercraftCosts = new BigDecimal(2_000_000);
        final var hovercraftPrice = new BigDecimal(3_000_000);
        final var insuranceMonth = new BigDecimal(1_000_000);
        final var spentMonth = hovercraftMonth.multiply(hovercraftCosts).add(insuranceMonth);
        final var incomeMonth = sales.multiply(hovercraftPrice);
        
        System.out.print(monthlyReport(incomeMonth, spentMonth));
    }
    
    private static String monthlyReport(BigDecimal incomeMonth, BigDecimal spentMonth) {
    	switch (incomeMonth.compareTo(spentMonth)) {
        	case -1: return "Loss";
        	case  1: return "Profit";
        	default: return "Broke Even";
        }
    }
}
