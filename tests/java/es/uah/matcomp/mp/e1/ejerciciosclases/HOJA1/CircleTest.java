package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(3.0);
        assertEquals(3.0, circle.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.0);
        assertEquals(4.0, circle.getRadius(), 0.001);
    }

    @Test
    void getArea() {
        Circle circle = new Circle(2.0);
        assertEquals(12.566, circle.getArea(), 0.001);
    }

    @Test
    void getCircumference() {
        Circle circle = new Circle(3.0);
        assertEquals(18.849, circle.getCircumference(), 0.001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(4.0);
        assertEquals("Circle[radius=4.0]", circle.toString());
    }
}