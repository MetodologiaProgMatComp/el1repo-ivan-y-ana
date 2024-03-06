package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(3, 4, 1, 2);
        assertEquals("(3, 4), speed=(1, 2)", point.toString());
    }

    @Test
    void moveUp() {
        MovablePoint point = new MovablePoint(3, 4, 1, 2);
        point.moveUp();
        assertEquals("(3, 2), speed=(1, 2)", point.toString());
    }

    @Test
    void moveDown() {
        MovablePoint point = new MovablePoint(3, 4, 1, 2);
        point.moveDown();
        assertEquals("(3, 6), speed=(1, 2)", point.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint point = new MovablePoint(3, 4, 1, 2);
        point.moveLeft();
        assertEquals("(2, 4), speed=(1, 2)", point.toString());
    }

    @Test
    void moveRight() {
        MovablePoint point = new MovablePoint(3, 4, 1, 2);
        point.moveRight();
        assertEquals("(4, 4), speed=(1, 2)", point.toString());
    }
}