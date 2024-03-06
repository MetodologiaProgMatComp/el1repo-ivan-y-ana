package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void SquareSide(){
        double side = 5.0;
        Square square = new Square(side);
        assertEquals(side, square.getSide(), 0.01);
        assertEquals(side, square.getWidth(), 0.01);
        assertEquals(side, square.getLength(), 0.01);
    }
    @Test
    void getSide() {
        double side = 3.0;
        String color = "Red";
        boolean filled = true;
        Square square = new Square(side, color, filled);
        assertEquals(side, square.getSide(), 0.001);
    }

    @Test
    void setSide() {
        double side = 4.0;
        Square square = new Square();
        square.setSide(side);
        assertEquals(side, square.getSide(), 0.001);
    }

    @Test
    void setWidth() {
        double side = 6.0;
        Square square = new Square();
        square.setWidth(side);
        assertEquals(side, square.getWidth(), 0.001);
    }

    @Test
    void setLength() {
        double side = 6.0;
        Square square = new Square();
        square.setLength(side);
        assertEquals(side, square.getLength(), 0.001);
    }

    @Test
    void testToString() {
        double side = 7.0;
        Square square = new Square(side, "Blue", false);
        String expectedString = "Square[Rectangle[Shape[color=Blue,filled=false],width=" + side + ",length=" + side + "]]";
        assertEquals(expectedString, square.toString());
    }
}