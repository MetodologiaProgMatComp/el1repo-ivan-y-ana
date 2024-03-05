package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2Test {

    @Test
    void testToString() {
        Point2 point = new Point2(3, 4);
        assertEquals("Point: (3,4)", point.toString());
    }

    @Test
    void getX() {
        Point2 point = new Point2(3, 4);
        assertEquals(3, point.getX());
    }

    @Test
    void getY() {
        Point2 point = new Point2(3, 4);
        assertEquals(4, point.getY());
    }

    @Test
    void setX() {
        Point2 point = new Point2(3, 4);
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void setY() {
        Point2 point = new Point2(3, 4);
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void setXY() {
        Point2 point = new Point2(3, 4);
        point.setXY(7, 8);
        assertEquals(7, point.getX());
        assertEquals(8, point.getY());
    }
}