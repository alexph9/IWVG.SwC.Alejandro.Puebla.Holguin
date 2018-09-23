package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;
    private Fraction defaultFraction;
    private Fraction noProperFraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 1);
        defaultFraction = new Fraction();
        noProperFraction = new Fraction(1, 2);
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

    @Test
    void testIsProperFraction() {
        assertFalse(fraction.isProperFraction());
        assertFalse(defaultFraction.isProperFraction());
        assertTrue(noProperFraction.isProperFraction());
    }

}
