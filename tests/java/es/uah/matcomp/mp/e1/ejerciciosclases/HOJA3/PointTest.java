package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point point = new Point(3.5f, 2.0f);
        assertEquals(3.5f, point.getX());
    }

    @Test
    void setX() {
        Point point = new Point();
        point.setX(5.0f);
        assertEquals(5.0f, point.getX());
    }

    @Test
    void getY() {
        Point point = new Point(3.5f, 2.0f);
        assertEquals(2.0f, point.getY());
    }

    @Test
    void setY() {
        Point point = new Point();
        point.setY(7.5f);
        assertEquals(7.5f, point.getY());
    }

    @Test
    void setXY() {
        Point point = new Point();
        point.setXY(2.0f, 4.5f);
        assertEquals(2.0f, point.getX());
        assertEquals(4.5f, point.getY());
    }

    @Test
    void getXY() {
        Point point = new Point(1.0f, 3.0f);
        float[] coordinates = point.getXY();
        assertArrayEquals(new float[]{1.0f, 3.0f}, coordinates);
    }

    @Test
    void testToString() {
        Point point = new Point(2.5f, 1.8f);
        assertEquals("(2.5,1.8)", point.toString());
    }
}