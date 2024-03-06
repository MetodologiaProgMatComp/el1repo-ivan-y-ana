package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @Test
    void getRadius() {
        Circle1 circle = new Circle1(5.0);
        assertEquals(5.0, circle.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        Circle1 circle = new Circle1();
        circle.setRadius(10.0);
        assertEquals(10.0, circle.getRadius(), 0.001);
    }

    @Test
    void getArea() {
        Circle1 circle = new Circle1(5.0);
        assertEquals(Math.PI * 25.0, circle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Circle1 circle = new Circle1(5.0);
        assertEquals(2 * Math.PI * 5.0, circle.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Circle1 circle = new Circle1(5.0, "red", true);
        assertEquals("Circle[Shape[color=red,filled=true],radius=5.0]", circle.toString());
    }
}