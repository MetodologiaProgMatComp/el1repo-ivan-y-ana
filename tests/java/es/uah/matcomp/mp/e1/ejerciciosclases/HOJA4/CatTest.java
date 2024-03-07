package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Cat;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat a1 = new Cat("Luna");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        a1.greets();
        assertEquals("Meow\n", outputStream.toString());
        System.setOut(System.out);
    }
}