package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals(3.0f, movablePoint.getXSpeed(), 0.01);
    }

    @Test
    void setXSpeed() {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        point.setXSpeed(5.0f);
        assertEquals(5.0f, point.getXSpeed(), 0.0);
    }

    @Test
    void getYSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals(4.0f, movablePoint.getYSpeed(), 0.01);
    }

    @Test
    void setYSpeed() {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        point.setYSpeed(5.0f);
        assertEquals(5.0f, point.getYSpeed(), 0.0);
    }

    @Test
    void setSpeed() {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(5.0f, 6.0f);
        assertEquals(5.0f, movablePoint.getXSpeed(), 0.01);
        assertEquals(6.0f, movablePoint.getYSpeed(), 0.01);
    }

    @Test
    void getSpeed() {
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f);
        float[] speed = movablePoint.getSpeed();
        assertEquals(2.0f, speed[0], 0.01);
        assertEquals(3.0f, speed[1], 0.01);
    }

    @Test
    void testToString() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals("(1.0,2.0),speed=(3.0,4.0)", movablePoint.toString());
    }

    @Test
    void move() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        movablePoint.move();
        assertEquals(1.5f, movablePoint.getX(), 0.01);
        assertEquals(3.0f, movablePoint.getY(), 0.01);
    }
}