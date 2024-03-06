package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void Acount(){
        Customer2 customer = new Customer2(101,"Pablo",'m');
        Account account = new Account(101, customer);
        assertEquals(101, account.getId());
        assertEquals(customer, account.getCustomer2());
        assertEquals(0.0, account.getBalance(), 0.001);
    }
    @Test
    void getId() {
        Customer2 c2 = new Customer2(1, "John Doe", 'm');
        Account a = new Account(1001, c2, 500.0);
        assertEquals(1001, a.getId());

    }

    @Test
    void getCustomer2() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        assertEquals(c2, a.getCustomer2());
    }

    @Test
    void getBalance() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        assertEquals(500.0, a.getBalance(), 0.001);
    }

    @Test
    void setBalance() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        a.setBalance(1000.0);
        assertEquals(1000.0, a.getBalance(), 0.001);

    }

    @Test
    void testToString() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        assertEquals("John Doe(1) balance= $500.0", a.toString());
    }

    @Test
    void getCustomerName() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        assertEquals("John Doe", a.getCustomerName());

    }

    @Test
    void deposit() {
        Customer2 c2 = new Customer2(1, "John Doe",'m');
        Account a = new Account(1001, c2, 500.0);
        double newBalance = a.deposit(200.0);
        assertEquals(700.0, newBalance, 0.001);
    }

    @Test
    void withdraw1() {
        Customer2 c2 = new Customer2(1, "John Doe", 'm');
        Account a = new Account(1001, c2, 500.0);
        double newBalance = a.withdraw(200.0);
        assertEquals(300.0, newBalance, 0.001);
    }
    @Test
    void withdraw2(){
        Customer2 c2 = new Customer2(1, "John Doe", 'm');
        Account a = new Account(1001, c2, 500.0);
        double newBalance = a.withdraw(600.0);
        assertEquals(500.0, newBalance, 0.001);
    }


}