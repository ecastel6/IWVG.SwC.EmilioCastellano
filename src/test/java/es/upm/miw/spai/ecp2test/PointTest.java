package es.upm.miw.spai.ecp2test;

import static org.junit.Assert.*;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Point;

import org.junit.Before;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPointIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }

    @Test
    public void testPointInt() {
        pt = new Point(2);
        assertEquals(2, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testPoint() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModule() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testPhase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }


    @Test
    public void testTranslateOrigin() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testGetX() {
        assertEquals(2, pt.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(3, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]",pt.toString());
    }

}
