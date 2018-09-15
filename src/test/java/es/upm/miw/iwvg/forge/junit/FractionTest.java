package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;
    private Fraction defaultFraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 1);
        defaultFraction = new Fraction();
    }

    @Test
    void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2, fraction.decimal(), 10e-5);
    }

}
