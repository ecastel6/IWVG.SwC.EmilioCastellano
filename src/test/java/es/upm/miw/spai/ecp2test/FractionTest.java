package es.upm.miw.spai.ecp2test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {
    Fraction fr;

    Fraction fr2;

    @Before
    public void before() {
        fr = new Fraction(3, 6);
        fr2 = new Fraction(2, 4);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(3, fr.getNumerator());
        assertEquals(6, fr.getDenominator());
    }

    @Test
    public void testFraction() {
        Fraction frx = new Fraction();
        assertEquals(1, frx.getNumerator());
        assertEquals(1, frx.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, this.fr.decimal(), 1e-15);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(3, this.fr.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(6, this.fr.getDenominator());
    }

    @Test
    public void testisImProper() {
        assertEquals(false, this.fr.isImproper());
    }

    @Test
    public void testisProper() {
        assertEquals(true, this.fr.isProper());
    }

    @Test
    public void testMultiplyFractions() {
        Fraction instance = new Fraction();
        assertEquals(6, instance.multiplyFractions(fr, fr2).getNumerator());
        assertEquals(24, instance.multiplyFractions(fr, fr2).getDenominator());
    }

}
