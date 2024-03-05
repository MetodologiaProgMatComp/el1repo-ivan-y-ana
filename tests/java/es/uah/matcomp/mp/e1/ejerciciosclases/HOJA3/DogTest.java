package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog perro = new Dog("Luna");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        perro.greets();
        assertEquals("Woof\n", outputStream.toString());
        System.setOut(System.out);
    }

    @Test
    void testGreets() {
        Dog perro2 = new Dog("Tego");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        perro2.greets(perro2);
        assertEquals("Woooof\n", outputStream.toString());
        System.setOut(System.out);
    }

    @Test
    void testToString() {
        Dog dog = new Dog("Buddy");
        assertEquals("Dog[Mammal[Animal[name=Buddy]]]", dog.toString());
    }
}