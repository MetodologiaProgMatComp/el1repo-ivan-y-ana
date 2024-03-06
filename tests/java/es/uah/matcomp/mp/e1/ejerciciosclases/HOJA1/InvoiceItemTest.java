package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals("1", item.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals("Item", item.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals(5, item.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        item.setQty(7);
        assertEquals(7, item.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals(10.0, item.getUnitPrice(), 0.001);
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        item.setUnitPrice(12.5);
        assertEquals(12.5, item.getUnitPrice(), 0.001);
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals(50.0, item.getTotal(), 0.001);
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("1", "Item", 5, 10.0);
        assertEquals("InvoiceItem[id=1,desc=Item,qty=5,unitPrice=10.0]", item.toString());
    }
}