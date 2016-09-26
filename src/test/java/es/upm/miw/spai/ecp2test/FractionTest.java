package es.upm.miw.spai.ecp2test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {
    Fraction fr;

    @Before
    public void before() {
        fr = new Fraction(3,6);
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
    public void testisPropia(){
        assertEquals(true, this.fr.isPropia());
    }
}
