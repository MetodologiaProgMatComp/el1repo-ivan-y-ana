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
        Date date = new Date(15, 12, 2023);
        assertEquals("15/12/2023", date.toString());
    }
}