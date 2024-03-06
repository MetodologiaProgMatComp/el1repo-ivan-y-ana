package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle circle = new ResizableCircle(5.0);
        assertEquals("ResizableCircle[Circle[radius=5.0]]", circle.toString());
    }

    @Test
    void resize() {
        ResizableCircle circle = new ResizableCircle(5.0);
        circle.resize(50); // Resize by 50%
        assertEquals("ResizableCircle[Circle[radius=2.5]]", circle.toString());
    }
}