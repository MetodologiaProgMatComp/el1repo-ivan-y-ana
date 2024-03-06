package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle3Test {

    @Test
    void testToString() {
        Circle3 circle = new Circle3(5.0);
        assertEquals("Circle[radius=5.0]", circle.toString());
    }

    @Test
    void getPerimeter() {
        Circle3 circle = new Circle3(5.0);
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.001);
    }

    @Test
    void getArea() {
        Circle3 circle = new Circle3(5.0);
        assertEquals(78.53981633974483, circle.getArea(), 0.001);
    }
}