package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        assertEquals("Computer Science", student.getProgram());
    }

    @Test
    void setProgram() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        student.setProgram("Electrical Engineering");
        assertEquals("Electrical Engineering", student.getProgram());
    }

    @Test
    void getYear() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        assertEquals(2, student.getYear());
    }

    @Test
    void setYear() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        student.setYear(3);
        assertEquals(3, student.getYear());
    }

    @Test
    void getFee() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        assertEquals(1000.0, student.getFee(), 0.01);
    }

    @Test
    void setFee() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        student.setFee(1200.0);
        assertEquals(1200.0, student.getFee(), 0.01); // Using delta for double comparison
    }

    @Test
    void testToString() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1000.0);
        assertEquals("Student[Person[name=John Doe,address=123 Main St], program=Computer Science, year=2, fee=1000.0]", student.toString());
    }
}