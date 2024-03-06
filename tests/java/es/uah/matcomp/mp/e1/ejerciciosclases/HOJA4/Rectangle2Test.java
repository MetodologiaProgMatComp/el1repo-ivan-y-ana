package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle2Test {

    @Test
    void testToString() {
        Rectangle2 rectangle = new Rectangle2(5.0, 10.0);
        assertEquals("Rectangle[width=5.0,length=10.0]", rectangle.toString());
    }

    @Test
    void getArea() {
        Rectangle2 rectangle = new Rectangle2(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Rectangle2 rectangle = new Rectangle2(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.001);
    }
}