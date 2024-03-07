package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Dog;
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
        Dog perro3 = new Dog("Fido");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        perro2.greets(perro3); // Invocar al método greets(Dog) con otro perro como parámetro
        assertEquals("Woooof\n", outputStream.toString());
        System.setOut(System.out);
    }
}