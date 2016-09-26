package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private static final String INICIALES = "E.C.";
    private static final int NUM = 36;
    private static final String NOMBRE = "Emilio";
    private static final String APELLIDO = "Castellano";

    public User usr;

    @Before
    public void before() {
        usr = new User (NUM, NOMBRE, APELLIDO);
    }

    public void testUser() {
        assertEquals(NUM, usr.getNumber());
        assertEquals(NOMBRE, usr.getName());
        assertEquals(APELLIDO, usr.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals(NOMBRE.concat(" ").concat(APELLIDO), usr.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals(INICIALES, usr.initials());
    }

    @Test
    public void testGetNumber() {
        assertEquals(NUM, usr.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals(NOMBRE, usr.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals(APELLIDO, usr.getFamilyName());
    }
}
