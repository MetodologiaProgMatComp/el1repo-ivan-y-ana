package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circle = new MyCircle(2,3,5);
        assertEquals(5, circle.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle();
        circle.setRadius(8);
        assertEquals(8, circle.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(2,5);
        MyCircle circle = new MyCircle(center,8);
        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle();
        MyPoint newCenter = new MyPoint(4, 6);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle(2, 3, 5);
        assertEquals(2, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle();
        assertEquals(0, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle(2, 3, 5);
        assertEquals(3, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle();
        assertEquals(0, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(2,3,5);
        MyPoint mp= new MyPoint(2,3);
        assertEquals(2, circle.getCenterX());
        assertEquals(3, circle.getCenterY());
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle();
        circle.setCenterXY(7, 9);
        assertEquals(7, circle.getCenterX());
        assertEquals(9, circle.getCenterY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(2, 3, 5);
        assertEquals("MyCircle[radius=5,center=(2,3)]", circle.toString());
    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(0, 0, 3);
        assertEquals(Math.PI * 9, circle.getArea(), 0.001);
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(0, 0, 4);
        assertEquals(2 * Math.PI * 4, circle.getCircumference(), 0.001);
    }

    @Test
    void distance() {
        MyCircle circle1 = new MyCircle(1, 1, 2);
        MyCircle circle2 = new MyCircle(4, 5, 3);
        assertEquals(5.0, circle1.distance(circle2), 0.001);
    }
}