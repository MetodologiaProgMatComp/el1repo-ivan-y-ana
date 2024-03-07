package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square(5.0);
        assertEquals(5.0, square.getSide(), 0.0);
    }

    @Test
    void setSide() {
        Square square = new Square();
        square.setSide(8.0);
        assertEquals(8.0, square.getSide(), 0.0);
    }

    @Test
    void setWidth() {
        Square square = new Square();
        square.setWidth(6.0);
        assertEquals(6.0, square.getWidth(), 0.0);
    }

    @Test
    void setLength() {
        // Caso de prueba 1: Establecer la longitud de un cuadrado a un valor positivo
        Square square1 = new Square();
        square1.setLength(5.0);
        assertEquals(5.0, square1.getLength(), 0.0001); // Verificar que la longitud sea 5.0
    }

    @Test
    void testToString() {
        Square square = new Square(5.0, "red", true);
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0],width=5.0,length=5.0]", square.toString());
    }
}