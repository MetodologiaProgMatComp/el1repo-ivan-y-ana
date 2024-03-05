package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        double width = 5.0;
        double length = 10.0;
        Rectangle rectangle = new Rectangle(width, length);
        assertEquals(width, rectangle.getWidth(), 0.01);
    }

    @Test
    void setWidth() {
        double width = 5.0;
        double length = 10.0;
        Rectangle rectangle = new Rectangle(width, length);
        rectangle.setWidth(6.0);
        assertEquals(6.0, rectangle.getWidth(), 0.01);
    }

    @Test
    void getLength() {
        double width = 5.0;
        double length = 10.0;
        Rectangle rectangle = new Rectangle(width, length);
        assertEquals(length, rectangle.getLength(), 0.01);
    }

    @Test
    void setLength() {
        double width = 5.0;
        double length = 10.0;
        Rectangle rectangle = new Rectangle(width, length);
        rectangle.setLength(15.0);
        assertEquals(15.0, rectangle.getLength(), 0.01);
    }

    @Test
    void getArea() {
        double width = 4.0;
        double length = 6.0;
        Rectangle rectangle = new Rectangle(width, length);
        assertEquals(width * length, rectangle.getArea(), 0.01);
    }

    @Test
    void getPerimeter() {
        double width = 4.0;
        double length = 6.0;
        Rectangle rectangle = new Rectangle(width, length);
        assertEquals(2 * (width + length), rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        double width = 4.0;
        double length = 6.0;
        String color = "Red";
        boolean filled = false;
        Rectangle rectangle = new Rectangle(width, length, color, filled);
        String expectedString = "Rectangle[Shape[color=Red,filled=false],width=4.0,length=6.0]";
        assertEquals(expectedString, rectangle.toString());
    }
}