package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals(10.0f, ball.getX(), 0.001);
    }

    @Test
    void setX() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.setX(21.0f);
        assertEquals(21.0f, ball.getX(), 0.001);
    }

    @Test
    void getY() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals(20.0f, ball.getY(), 0.001);
    }

    @Test
    void setY() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.setY(31.0f);
        assertEquals(31.0f, ball.getY(), 0.001);
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals(5, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.setRadius(6);
        assertEquals(6, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals(2.0f, ball.getXDelta(), 0.001);
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.setXDelta(8.0f);
        assertEquals(8.0f, ball.getXDelta(), 0.001);
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals(3.0f, ball.getYDelta(), 0.001);
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.setYDelta(5.0f);
        assertEquals(5.0f, ball.getYDelta(), 0.001);
    }

    @Test
    void move() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.move();
        assertEquals(12.0f, ball.getX(), 0.001);
        assertEquals(23.0f, ball.getY(), 0.001);
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.reflectHorizontal();
        assertEquals(-2.0f, ball.getXDelta(), 0.001);
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        ball.reflectVertical();
        assertEquals(-3.0f, ball.getYDelta(), 0.001);
    }

    @Test
    void testToString() {
        Ball ball = new Ball(10.0f, 20.0f, 5, 2.0f, 3.0f);
        assertEquals("Ball[(10.0,20.0),speed=(2.0,3.0)]", ball.toString());
    }
}