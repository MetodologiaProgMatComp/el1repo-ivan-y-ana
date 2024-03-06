package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(3, 4, 1, 2, 5);
        assertEquals("(3, 4), speed=(1, 2),radius=5", circle.toString());
    }

    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveUp();
        assertEquals("(0, -1), speed=(1, 1),radius=5", circle.toString());
    }

    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveDown();
        assertEquals("(0, 1), speed=(1, 1),radius=5", circle.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveLeft();
        assertEquals("(-1, 0), speed=(1, 1),radius=5", circle.toString());
    }

    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveRight();
        assertEquals("(1, 0), speed=(1, 1),radius=5", circle.toString());
    }
}