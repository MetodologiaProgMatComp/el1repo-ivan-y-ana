package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getIsbn() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        assertEquals("1234567890", book.getIsbn());
    }
    @Test
    void testFourParameterConstructor() {
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book = new Book("1234567890", "Test Book", author, 29.99);
        assertEquals("1234567890", book.getIsbn());
        assertEquals("Test Book", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(29.99, book.getPrice(), 0.001);
        assertEquals(0, book.getQty()); // Default value for qty should be 0
    }
    @Test
    void getName() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        assertEquals("Test Book", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book = new Book("1234567890", "Test Book", author, 29.99, 5);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        assertEquals(19.99, book.getPrice(), 0.001); // Tolerancia para la comparación de números de punto flotante
    }

    @Test
    void setPrice() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        book.setPrice(29.99);
        assertEquals(29.99, book.getPrice(), 0.001);
    }

    @Test
    void getQty() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        assertEquals(5, book.getQty());
    }

    @Test
    void setQty() {
        Book book = new Book("1234567890", "Test Book", new Author("Author Name", "author@example.com"), 19.99, 5);
        book.setQty(10);
        assertEquals(10, book.getQty());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book = new Book("1234567890", "Test Book", author, 29.99, 5);
        assertEquals("John Doe", book.getAuthorName());
    }

    @Test
    void testToString() {
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book = new Book("1234567890", "Test Book", author, 29.99, 5);
        assertEquals("Book[isbn=1234567890,name=Test Book,Author[name=John Doe,email=john.doe@example.com],price=29.99,qty=5]", book.toString());
    }
}