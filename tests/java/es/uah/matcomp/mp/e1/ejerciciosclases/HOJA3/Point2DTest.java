package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D point = new Point2D(2.5f, 3.0f);
        assertEquals(2.5f, point.getX(), 0.0f);
    }

    @Test
    void setX() {
        Point2D point = new Point2D();
        point.setX(5.0f);
        assertEquals(5.0f, point.getX(), 0.0f);
    }

    @Test
    void getY() {
        Point2D point = new Point2D(2.5f, 3.0f);
        assertEquals(3.0f, point.getY(), 0.0f);
    }

    @Test
    void setY() {
        Point2D point = new Point2D();
        point.setY(7.5f);
        assertEquals(7.5f, point.getY(), 0.0f);
    }

    @Test
    void setXY() {
        Point2D point = new Point2D();
        point.setY(7.5f);
        assertEquals(7.5f, point.getY(), 0.0f);
    }

    @Test
    void getXY() {
        Point2D point = new Point2D(1.0f, 3.0f);
        float[] expected = {1.0f, 3.0f};
        assertArrayEquals(expected, point.getXY(), 0.0f);
    }

    @Test
    void testToString() {
        Point2D point = new Point2D(3.5f, 2.0f);
        assertEquals("(3.5,2.0)", point.toString());
    }
}