package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;
    private Fraction defaultFraction;
    private Fraction properFraction;
    private Fraction fractiontoMultiply;
    @BeforeEach
    void before() {
        fraction = new Fraction(2, 1);
        defaultFraction = new Fraction();
        properFraction = new Fraction(1, 2);
        fractiontoMultiply = new Fraction (3,6);
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
        assertTrue(properFraction.isProperFraction());
    }
    @Test
    void testMultiply(){
        assertEquals(4, fraction.multiply(fraction).getNumerator());
        assertEquals(1, fraction.multiply(fraction).getDenominator());
        assertEquals(6, fraction.multiply(fractiontoMultiply).getNumerator());
        assertEquals(6, fraction.multiply(fractiontoMultiply).getDenominator());
    }

    @Test
    void testDivision(){
        assertEquals(2, fraction.division(fraction).getNumerator());
        assertEquals(2, fraction.division(fraction).getDenominator());
        assertEquals(4, fraction.division(properFraction).getNumerator());
        assertEquals(1, fraction.division(properFraction).getDenominator());
    }
}
