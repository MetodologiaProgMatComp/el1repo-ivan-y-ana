package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder(3.0, 4.0);
        assertEquals(4.0, cylinder.getHeight(), 0.001);
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(4.0, 5.0);
        assertEquals(251.32741228718345, cylinder.getVolume(), 0.001);
    }

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder(2.5, 6.0);
        assertEquals(133.5176, cylinder.getArea(), 0.001);
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2.0, 3.0);
        assertEquals("Cylinder: subclass of Circle[Shape[color=red,filled=true],radius=2.0] height=3.0", cylinder.toString());
    }
}