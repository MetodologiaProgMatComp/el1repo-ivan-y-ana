package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cylinder2Test {

    @Test
    void Cylinder2(){
        Cylinder2 cylinder = new Cylinder2();
        assertEquals(1.0, cylinder.getHeight(), 0.0001);
        assertEquals(1.0, cylinder.getBaseRadius(), 0.0001);
        assertEquals(Math.PI, cylinder.getBaseArea(), 0.0001);
        assertEquals(Math.PI, cylinder.getVolume(), 0.0001);
        assertEquals("Cylinder: base radius=1.0, height=1.0)", cylinder.toString());
    }
    @Test
    void getHeight() {
        double radius = 2.5;
        double height = 3.0;
        Cylinder2 cylinder = new Cylinder2(radius, height);
        assertEquals(height, cylinder.getHeight(), 0.001);
    }

    @Test
    void getBaseRadius() {
        double radius = 2.5;
        double height = 3.0;
        Cylinder2 cylinder = new Cylinder2(radius, height);
        assertEquals(radius, cylinder.getBaseRadius(), 0.001);
    }

    @Test
    void getBaseArea() {
        double radius = 2.5;
        double height = 3.0;
        Cylinder2 cylinder = new Cylinder2(radius, height);
        assertEquals(Math.PI * radius * radius, cylinder.getBaseArea(), 0.001);
    }

    @Test
    void getVolume() {
        double radius = 2.5;
        double height = 3.0;
        Cylinder2 cylinder = new Cylinder2(radius, height);
        assertEquals(Math.PI * radius * radius * height, cylinder.getVolume(), 0.001);
    }

    @Test
    void testToString() {
        double radius = 2.5;
        double height = 3.0;
        Cylinder2 cylinder = new Cylinder2(radius, height);
        assertEquals("Cylinder: base radius=" + radius + ", height=" + height + ")", cylinder.toString());
    }
}