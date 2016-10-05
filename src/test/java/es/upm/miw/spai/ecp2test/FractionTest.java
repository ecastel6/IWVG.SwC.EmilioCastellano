package es.upm.miw.spai.ecp2test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {
    Fraction fraction1;
    Fraction fraction2;
    
    @Before
    public void before() {
        fraction1 = new Fraction(3,6);
        fraction2 = new Fraction(2,4);
    }
    @Test
    public void testFractionIntInt() {
        assertEquals(3, fraction1.getNumerator());
        assertEquals(6, fraction1.getDenominator());
    }

    @Test
    public void testFraction() {
        Fraction frx = new Fraction();
        assertEquals(1, frx.getNumerator());
        assertEquals(1, frx.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, this.fraction1.decimal(), 1e-15);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(3, this.fraction1.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(6, this.fraction1.getDenominator());
    }
    
//    @Test
//    public void testisPropia(){
//        assertEquals(true, this.fr.isPropia());
//    }
    
    @Test
    public void testisImProper(){
        assertEquals(false, this.fraction1.isImproper());
    }
    
    @Test
    public void testisProper(){
        assertEquals(true, this.fraction1.isProper());
    }
    
    @Test
    public void testMultiplyFractions(){
                  
    }
   
    
}
