package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff staff = new Staff("John Doe", "123 Main St", "School of Engineering", 50000.0);
        assertEquals("School of Engineering", staff.getSchool());
    }

    @Test
    void setSchool() {
        Staff staff = new Staff("John Doe", "123 Main St", "School of Engineering", 50000.0);
        staff.setSchool("Carmen Burgos");
        assertEquals("Carmen Burgos", staff.getSchool());
    }

    @Test
    void getPay() {
        Staff staff = new Staff("John Doe", "123 Main St", "School of Engineering", 50000.0);
        assertEquals(50000.0, staff.getPay(), 0.01);
    }

    @Test
    void setPay() {
        Staff staff = new Staff("John Doe", "123 Main St", "School of Engineering", 50000.0);
        staff.setPay(100000.0);
        assertEquals(100000.0, staff.getPay(), 0.01);
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Bob Johnson", "789 Pine St", "School of Business", 80000.0);
        String expectedString = "Staff[Person[name=Bob Johnson,address=789 Pine St],school=School of Business,pay=80000.0]";
        assertEquals(expectedString, staff.toString());
    }
}