package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Buddy");
        assertEquals("Woof", dog.greets());
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        assertEquals("Woooof", dog1.greets(dog2));
    }
}