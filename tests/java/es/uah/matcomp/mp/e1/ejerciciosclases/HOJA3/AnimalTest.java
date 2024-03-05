package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal animal = new Animal("Lion");
        String result = animal.toString();
        assertEquals("Animal[name=Lion]", result);
    }
}