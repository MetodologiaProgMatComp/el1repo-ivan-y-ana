package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Dog;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog a2 = new BigDog("Tego");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        a2.greets();
        assertEquals("Wooow\n", outputStream.toString());
        System.setOut(System.out);
    }

    @Test
    void testGreets() {
        BigDog a2 = new BigDog("Tego");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        a2.greets();
        assertEquals("Wooow\n", outputStream.toString());
        System.setOut(System.out);
    }

    @Test
    void testGreets1() {
        BigDog a2 = new BigDog("Tego");
        BigDog anotherBigDog = new BigDog("Buddy");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        a2.greets(anotherBigDog);
        assertEquals("Wooooooooow\n", outputStream.toString());
        System.setOut(System.out);
    }
}