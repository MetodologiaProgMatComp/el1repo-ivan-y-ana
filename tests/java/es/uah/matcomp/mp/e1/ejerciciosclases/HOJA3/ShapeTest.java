package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Shape("green", true);
        assertEquals("green", shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape = new Shape();
        shape.setColor("yellow");
        assertEquals("yellow", shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape = new Shape("purple", false);
        assertFalse(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape = new Shape();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape = new Shape("orange", true);
        assertEquals("Shape[color=orange,filled=true]", shape.toString());
    }
}