package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 c = new Customer2(1001, "John Doe", 'm');
        assertEquals(1001, c.getId());
    }

    @Test
    void getName() {
        Customer2 c = new Customer2(1001, "John Doe", 'm');
        assertEquals("John Doe", c.getName());
    }

    @Test
    void getGender() {
        Customer2 c = new Customer2(1001, "John Doe", 'm');
        assertEquals('m', c.getGender());
    }

    @Test
    void testToString() {
        Customer2 c = new Customer2(1001, "John Doe", 'm');
        assertEquals("John Doe(1001)", c.toString());
    }
}