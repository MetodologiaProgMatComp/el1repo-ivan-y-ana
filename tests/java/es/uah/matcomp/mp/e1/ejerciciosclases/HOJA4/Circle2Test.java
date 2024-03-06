package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void testToString() {
        Circle2 circle = new Circle2(5.0);
        assertEquals("Circle[radius=5.0]", circle.toString());
    }

    @Test
    void getArea() {
        Circle2 circle = new Circle2(5.0);
        assertEquals(78.53981633974483, circle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Circle2 circle = new Circle2(5.0);
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.001);
    }
}