package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(1, 2, 2022);
        assertEquals(1, date.getDay());
    }

    @Test
    void getMonth() {
        Date date = new Date(1, 2, 2022);
        assertEquals(2, date.getMonth());
    }

    @Test
    void getYear() {
        Date date = new Date(1, 2, 2022);
        assertEquals(2022, date.getYear());
    }

    @Test
    void setDay() {
        Date date = new Date(1, 2, 2022);
        date.setDay(5);
        assertEquals(5, date.getDay());
    }

    @Test
    void setMonth() {
        Date date = new Date(1, 2, 2022);
        date.setMonth(3);
        assertEquals(3, date.getMonth());
    }

    @Test
    void setYear() {
        Date date = new Date(1, 2, 2022);
        date.setYear(2023);
        assertEquals(2023, date.getYear());
    }

    @Test
    void setDate() {
        Date date = new Date(1, 2, 2022);
        date.setDate(10, 5, 2023);
        assertEquals(10, date.getDay());
        assertEquals(5, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    void testToString() {
        Date date1 = new Date(5, 8, 2023);
        assertEquals("05/08/2023", date1.toString());
        Date date2 = new Date(9, 12, 2021);
        assertEquals("09/12/2021", date2.toString());
        Date date3 = new Date(15, 4, 2022);
        assertEquals("15/04/2022", date3.toString());
        Date date4 = new Date(25, 10, 2024);
        assertEquals("25/10/2024", date4.toString());
    }
}