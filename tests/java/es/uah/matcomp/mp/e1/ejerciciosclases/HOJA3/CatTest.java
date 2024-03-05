package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets(){
        Cat gato = new Cat("Luna");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        gato.greets();
        assertEquals("Meow\n", outputStream.toString());
        System.setOut(System.out);
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Fluffy");
        assertEquals("Cat[Mammal[Animal[name=Fluffy]]]", cat.toString());
    }
}