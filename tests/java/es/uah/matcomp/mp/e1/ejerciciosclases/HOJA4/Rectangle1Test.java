package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle1Test {

    @Test
    void getWidth() {
        Rectangle1 rectangle = new Rectangle1();
        assertEquals(1.0, rectangle.getWidth(), 0.0);
    }

    @Test
    void setWidth() {
        Rectangle1 rectangle = new Rectangle1();
        rectangle.setWidth(5.0);
        assertEquals(5.0, rectangle.getWidth(), 0.0);
    }

    @Test
    void getLength() {
        Rectangle1 rectangle = new Rectangle1();
        assertEquals(1.0, rectangle.getLength(), 0.0);
    }

    @Test
    void setLength() {
        Rectangle1 rectangle = new Rectangle1();
        rectangle.setLength(10.0);
        assertEquals(10.0, rectangle.getLength(), 0.0);
    }

    @Test
    void getArea() {
        Rectangle1 rectangle = new Rectangle1(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.0);
    }

    @Test
    void getPerimeter() {
        Rectangle1 rectangle = new Rectangle1(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.0);
    }

    @Test
    void testToString() {
        Rectangle1 rectangle = new Rectangle1(5.0, 10.0, "blue", true);
        assertEquals("Rectangle[Shape[color=blue,filled=true],width=5.0,length=10.0]", rectangle.toString());
    }
}