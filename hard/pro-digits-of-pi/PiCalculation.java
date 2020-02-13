import java.util.Scanner;
import java.math.MathContext;
import java.math.BigDecimal;

public class PiCalculation {

    static BigDecimal calculatePi(final int precision) {
        final var MAX_ITERATIONS = 100;
    	final var mc = new MathContext​(5 + precision + precision / 10);
    	final var mc2 = new MathContext​(2 + precision);
    	final var TWO = new BigDecimal(2);
    	final var FOUR = new BigDecimal(4);
    	
    	var a = BigDecimal.ONE;
    	var b = a.divide(TWO.sqrt(mc), mc);
    	var t = a.divide(FOUR, mc);
    	var p = BigDecimal.ONE;
    	var i = 0;
    	
    	do {
    		final var an = a.add(b).divide(TWO, mc);
    		final var bn = a.multiply(b).sqrt(mc);
    		final var tn = t.subtract(p.multiply(a.subtract(an).pow(2, mc), mc));
    		final var pn = TWO.multiply(p, mc);
    		
    		a = an;
    		b = bn;
    		t = tn;
    		p = pn;
    		
    	} while (!a.round(mc2).equals(b.round(mc2)) && ++i < MAX_ITERATIONS);
    
    	final var pi = a.add(b).pow(2, mc).divide(t.multiply(FOUR, mc), mc).round(mc2);
    	
    	return pi;
    }
    
    public static void main(final String[] args) {
        final var PRECISION = 1000 + 100;
        final var input = new Scanner(System.in);
        final var n = input.nextInt();
        input.close();
        
        final var pi = calculatePi(PRECISION);
        
        System.out.print(pi.toString().charAt(n+1));
    }
}
