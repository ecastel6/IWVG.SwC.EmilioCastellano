package es.upm.miw.spai.ecp2test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.spai.ecp2.Point;

import org.junit.Before;

public class PointTest {

    Point legitPt, ilegitPt;

    public static final int POSX = 2;

    public static final int NEGX = -2;

    public static final int POSY = 3;

    public static final int NEGY = -3;

    @Before
    public void before() {
        try {
            legitPt = new Point(POSX, POSY);
            ilegitPt = new Point(NEGX, NEGY);
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test(expected = java.lang.Exception.class)
    public void negativeparm() throws Exception {
        @SuppressWarnings("unused")
        Point pto = new Point(-10, 20);
    }

    @Test
    public void testPointIntInt() {
        // Test positive values
        try {
            assertEquals(POSX, legitPt.getX());
            assertEquals(POSY, legitPt.getY());

            // Now test negative values
            assertEquals(NEGX, ilegitPt.getX());
            assertEquals(NEGY, ilegitPt.getY());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(expected = java.lang.Exception.class)
    public void testModule() {
        assertEquals(3.60555, legitPt.module(), 10e-5);
        assertEquals(3.60555, ilegitPt.module(), 10e-5);
    }

    @Test(expected = java.lang.Exception.class)
    public void testPhase() {
        assertEquals(0.9828, legitPt.phase(), 10e-5);
        assertEquals(0.9828, ilegitPt.phase(), 10e-5);
    }

    @Test(expected = java.lang.Exception.class)
    public void testTranslateOrigin() throws Exception {
        // lets test legit points translate
        this.legitPt.translateOrigin(new Point(1, 1));
        assertEquals(1, legitPt.getX());
        assertEquals(2, legitPt.getY());
        // now ilegit
        this.ilegitPt.translateOrigin(new Point(1, 1));
        assertEquals(4, legitPt.getX());
        assertEquals(2, legitPt.getY());
    }

    @Test
    public void testGetX() {
        assertEquals(2, legitPt.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(3, legitPt.getY());
    }

    @Test(expected = java.lang.Exception.class)
    public void testToString() {
        assertEquals("Point[" + POSX + "," + POSY + "]", legitPt.toString());
        assertEquals("Point[" + NEGX + "," + NEGY + "]", ilegitPt.toString());
    }

}
