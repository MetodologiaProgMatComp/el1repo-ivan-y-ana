package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void Cylindervacio(){
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getHeight());
        assertEquals(12.56637, cylinder.getArea(), 0.0001);
        assertEquals(3.141592653589793, cylinder.getVolume(), 0.0001);
        assertEquals("Cylinder: subclass of Circle[Shape[color=red,filled=true],radius=1.0] height=1.0", cylinder.toString());
    }
    @Test
    void CylinderHeight(){
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(5.0, cylinder.getHeight());
        assertEquals(37.6991, cylinder.getArea(), 0.0001);
        assertEquals(15.7079, cylinder.getVolume(), 0.0001);
        assertEquals("Cylinder: subclass of Circle[Shape[color=red,filled=true],radius=1.0] height=5.0", cylinder.toString());
    }
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