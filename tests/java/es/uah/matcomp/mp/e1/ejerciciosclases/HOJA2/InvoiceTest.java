package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals(1, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(101, "John Doe", 10);
        Invoice invoice = new Invoice(1, customer, 100.0);
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        Customer customer = new Customer(101, "John Doe", 10);
        Customer customer2 = new Customer(102, "Jane Smith", 5);
        invoice.setCustomer(customer2);
        assertEquals(customer2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals(100.0, invoice.getAmount(), 0.001);
    }

    @Test
    void setAmount() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        invoice.setAmount(150.0);
        assertEquals(150.0, invoice.getAmount(), 0.001);
    }

    @Test
    void getCustomerId() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals(101, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals("John Doe", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals(90.0, invoice.getAmountAfterDiscount(), 0.001);
    }

    @Test
    void testToString() {
        Invoice invoice = new Invoice(1, new Customer(101, "John Doe", 10), 100.0);
        assertEquals("Invoice[id=1,customer=John Doe(101)(10%),amount=100.0]", invoice.toString());
    }
}