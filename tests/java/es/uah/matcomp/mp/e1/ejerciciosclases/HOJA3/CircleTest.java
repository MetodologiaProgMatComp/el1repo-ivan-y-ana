package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        double radius = 5.0;
        String color = "blue";
        boolean filled = false;
        Circle circle = new Circle(radius, color, filled);
        assertEquals(radius, circle.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        double radius = 7.0;
        Circle circle = new Circle();
        circle.setRadius(radius);
        assertEquals(radius, circle.getRadius(), 0.001);
    }

    @Test
    void getArea() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        assertEquals(Math.PI * radius * radius, circle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        double radius = 4.0;
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI * radius, circle.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        double radius = 2.5;
        String color = "green";
        boolean filled = true;
        Circle circle = new Circle(radius, color, filled);
        String expectedString = "Circle[Shape[color=green,filled=true],radius=2.5]";
        assertEquals(expectedString, circle.toString());
    }
}