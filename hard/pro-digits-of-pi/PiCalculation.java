import java.util.Scanner;
import java.math.MathContext;
import java.math.BigDecimal;
import static java.math.BigDecimal.ONE;

/*
The Gauss–Legendre iterative algorithm.

The algorithm has quadratic convergence, which essentially means that
the number of correct digits doubles with each iteration of the algorithm.
*/
public class DigitsOfPi {
    static BigDecimal calculatePi(final int precision) {

    	final var mc = new MathContext​(precision + 2);
    	final var mc2 = new MathContext​(precision + 1);
    	
    	final var TWO = new BigDecimal(2);
    	final var FOUR = new BigDecimal(4);
    	
    	// Initial value setting:
    	
    	var a = ONE;
    	var b = ONE.divide(TWO.sqrt(mc), mc);
    	var t = ONE.divide(FOUR, mc);
    	var p = ONE;
    	
    	// Repeat the following instructions until 
        // the difference of a and b is within the desired accuracy
        
    	do {
    		var an = a.add(b).divide(TWO, mc);
    		var bn = a.multiply(b).sqrt(mc);
    		var tn = t.subtract(p.multiply(a.subtract(an).pow(2, mc), mc));
    		var pn = TWO.multiply(p, mc);
    		
    		a = an;
    		b = bn;
    		t = tn;
    		p = pn;
    		
    	} while (!a.round(mc2).equals(b.round(mc2)));
    
    	final var pi = a.add(b).pow(2, mc).divide(t.multiply(FOUR, mc), mc).round(mc2);
    	
    	return pi;
    }
    
    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var n = input.nextInt() + 1;
        input.close();
        
        final var pi = calculatePi(n);
        
        System.out.print(pi.toString().charAt(n));
    }
}
