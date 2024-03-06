package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account acc = new Account("1", "John");
        assertEquals("1", acc.getID());
    }

    @Test
    void getName() {
        Account acc = new Account("1", "John");
        assertEquals("John", acc.getName());
    }

    @Test
    void getBalance() {
        Account acc = new Account("1", "John", 100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void credit() {
        Account acc = new Account("1", "John");
        acc.credit(50);
        assertEquals(50, acc.getBalance());
    }

    @Test
    void debit() {
        Account acc = new Account("1", "John", 100);
        acc.debit(50);
        assertEquals(50, acc.getBalance());
    }

    @Test
    void transferTo() {
        Account acc = new Account("1", "John", 100);
        acc.debit(150);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void testToString() {
        Account acc = new Account("1", "John", 100);
        assertEquals("Account[id=1,name=John,balance=100]", acc.toString());
    }
}