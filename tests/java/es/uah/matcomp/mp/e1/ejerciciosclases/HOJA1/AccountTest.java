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
    void debit1() {
        Account acc = new Account("1", "John", 100);
        acc.debit(50);
        assertEquals(50, acc.getBalance());
    }

    @Test
    void debit2(){
        Account account = new Account("1", "John", 50);
        account.debit(100);
        assertEquals(50, account.getBalance());
    }
    @Test
    void transferTo1() {
        Account account1 = new Account("1", "John", 100);
        Account account2 = new Account("2", "Jane", 50);
        account1.transferTo(account2, 50);
        assertEquals(50, account1.getBalance());
        assertEquals(100, account2.getBalance());
    }

    @Test
    void transferTo2(){
        Account account1 = new Account("1", "John", 50);
        Account account2 = new Account("2", "Jane", 100);
        account1.transferTo(account2, 75);
        assertEquals(50, account1.getBalance());
        assertEquals(100, account2.getBalance());

    }
    @Test
    void testToString() {
        Account acc = new Account("1", "John", 100);
        assertEquals("Account[id=1,name=John,balance=100]", acc.toString());
    }
}