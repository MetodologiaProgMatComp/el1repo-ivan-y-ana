package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(10, 30, 45);
        assertEquals(10, time.getHour());
    }

    @Test
    void getMinute() {
        Time time = new Time(10, 30, 45);
        assertEquals(30, time.getMinute());
    }

    @Test
    void getSecond() {
        Time time = new Time(10, 30, 45);
        assertEquals(45, time.getSecond());
    }

    @Test
    void setHour() {
        Time time = new Time(10, 30, 45);
        time.setHour(12);
        assertEquals(12, time.getHour());
    }

    @Test
    void setMinute() {
        Time time = new Time(10, 30, 45);
        time.setMinute(20);
        assertEquals(20, time.getMinute());
    }

    @Test
    void setSecond() {
        Time time = new Time(10, 30, 45);
        time.setSecond(50);
        assertEquals(50, time.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(10, 30, 45);
        time.setTime(12, 20, 50);
        assertEquals(12, time.getHour());
        assertEquals(20, time.getMinute());
        assertEquals(50, time.getSecond());
    }

    @Test
    void testToString() {
        Time time1 = new Time(1, 2, 3);
        assertEquals("01:02:03", time1.toString());
        Time time2 = new Time(12, 34, 56);
        assertEquals("12:34:56", time2.toString());
        Time time3 = new Time(5, 9, 15);
        assertEquals("05:09:15", time3.toString());
        Time time4 = new Time(8, 12, 7);
        assertEquals("08:12:07", time4.toString());
        Time time5 = new Time(15, 3, 45);
        assertEquals("15:03:45", time5.toString());
        Time time6 = new Time(18, 5, 9);
        assertEquals("18:05:09", time6.toString());
        Time time7 = new Time(0, 0, 0);
        assertEquals("00:00:00", time7.toString());
        Time time8 = new Time(23, 59, 59);
        assertEquals("23:59:59", time8.toString());
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getSecond());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getHour());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(59, time.getSecond());
        assertEquals(59, time.getMinute());
        assertEquals(23, time.getHour());
    }
}