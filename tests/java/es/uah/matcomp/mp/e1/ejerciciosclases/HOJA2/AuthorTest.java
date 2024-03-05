package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("John Doe", "john.doe@example.com");
        assertEquals("John Doe", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("John Doe", "john.doe@example.com");
        assertEquals("john.doe@example.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Jane Doe", "jane.doe@example.com");
        assertEquals("jane.doe@example.com", author.getEmail());
        author.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("Alice Wonderland", "alice@example.com");
        assertEquals("Author[name=Alice Wonderland,email=alice@example.com]", author.toString());
    }
}