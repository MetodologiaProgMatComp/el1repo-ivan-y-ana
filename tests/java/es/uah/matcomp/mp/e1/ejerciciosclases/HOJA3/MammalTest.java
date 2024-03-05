package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        String name = "Elephant";
        Mammal mammal = new Mammal(name);
        String expectedToString = "Mammal[Animal[name=" + name + "]]";
        assertEquals(expectedToString, mammal.toString());
    }
}