package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("John Doe", "123 Main Street");
        String name = person.getName();
        assertEquals("John Doe", name);
    }

    @Test
    void getAddress() {
        Person person = new Person("Jane Smith", "456 Oak Avenue");
        String address = person.getAddress();
        assertEquals("456 Oak Avenue", address);
    }

    @Test
    void setAddress() {
        Person person = new Person("Alice Johnson", "789 Pine Road");
        person.setAddress("987 Elm Street");
        assertEquals("987 Elm Street", person.getAddress());
    }

    @Test
    void testToString() {
        Person person = new Person("Bob Brown", "321 Birch Lane");
        String toStringResult = person.toString();
        assertEquals("Person[name=Bob Brown,address=321 Birch Lane]", toStringResult);
    }
}