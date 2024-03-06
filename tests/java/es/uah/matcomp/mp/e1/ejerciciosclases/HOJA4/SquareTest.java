package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square(5.0);
        assertEquals(5.0, square.getSide(), 0.001);
    }

    @Test
    void setSide() {
        Square square = new Square();
        square.setSide(10.0);
        assertEquals(10.0, square.getSide(), 0.001);
    }

    @Test
    void setWidth() {
        Square square = new Square(5.0);
        square.setWidth(10.0);
        assertEquals(10.0, square.getWidth(), 0.001);
    }

    @Test
    void setLength() {
        Square square = new Square(5.0);
        square.setLength(10.0);
        assertEquals(10.0, square.getLength(), 0.001);
    }

    @Test
    void testToString() {
        Square square = new Square(5.0, "red", true);
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0],width=5.0,length=5.0]", square.toString());
    }
}