package com.rabestro.sololearn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.IntStream;

public class KaleidoscopesDifference {

    public static void main(String[] args) {
        IntStream.range(2, 1000)
            .filter(i -> !big(i).equals(small(i)))
            .forEach(i -> System.out.printf("%6d %10s %10s %n", i, big(i),small(i) ));
    }
    
    /**
        This method used in SoloLearn to calculate Kaleidoscopes 
    */
    static BigDecimal small(int kaleidoscopes) {
        double discount = 0.9;
        double tax = 1.07;

        double price = kaleidoscopes * 5;

        if (kaleidoscopes > 1) {
            price *= discount;
        }
        price *= tax;
        return new BigDecimal(price).setScale(2, RoundingMode.HALF_EVEN);
    }
    
    /**
        This is the correct method to calculate Kaleidoscopes 
    */
    static BigDecimal big(int kaleidoscopes) {
        final var discount = new BigDecimal(0.9);
        final var tax = new BigDecimal(1.07);

        var price = new BigDecimal(kaleidoscopes * 5);

        if (kaleidoscopes > 1) {
            price = price.multiply(discount);
        }

        price = price.multiply(tax);
        return price.setScale(2, RoundingMode.HALF_EVEN);
    }
}
