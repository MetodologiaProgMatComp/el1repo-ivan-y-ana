package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Circle1();
        assertEquals("red", shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape = new Circle1();
        shape.setColor("blue");
        assertEquals("blue", shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape = new Circle1();
        assertTrue(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape = new Circle1();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void getArea() {
        Circle1 circle = new Circle1(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle1 circle = new Circle1(3.0);
        assertEquals(2.0 * Math.PI * 3.0, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle1 circle = new Circle1(4.0, "yellow", true);
        assertEquals("Circle[Shape[color=yellow,filled=true],radius=4.0]", circle.toString());
    }
}