package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(5.0f, rectangle.getLength(), 0.001);
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        rectangle.setLength(7.0f);
        assertEquals(7.0f, rectangle.getLength(), 0.001);
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(3.0f, rectangle.getWidth(), 0.001);
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        rectangle.setWidth(4.0f);
        assertEquals(4.0f, rectangle.getWidth(), 0.001);
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(15.0, rectangle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(16.0, rectangle.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals("Rectangle[length=5.0,width=3.0]", rectangle.toString());
    }
}