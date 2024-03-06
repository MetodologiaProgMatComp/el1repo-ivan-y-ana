package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(1, employee.getId());
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("John", employee.getFirstName());
    }

    @Test
    void getLastName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("Doe", employee.getLastName());
    }

    @Test
    void getName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("JohnDoe", employee.getName());
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(50000, employee.getSalary());
    }

    @Test
    void setSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        employee.setSalary(60000);
        assertEquals(60000, employee.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(600000, employee.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        employee.raiseSalary(10);
        assertEquals(55000, employee.getSalary());
    }

    @Test
    void testToString() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("Employee[id=1,name=John Doe,salary=50000]", employee.toString());
    }
}