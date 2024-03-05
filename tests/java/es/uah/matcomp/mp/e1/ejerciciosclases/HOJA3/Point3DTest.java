package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D point = new Point3D(1.0f, 2.0f, 3.0f);
        assertEquals(3.0f, point.getZ(), 0.0);
    }

    @Test
    void setZ() {
        Point3D point = new Point3D();
        point.setZ(6.5f);
        assertEquals(6.5f, point.getZ(), 0.0);
    }

    @Test
    void setXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(4.0f, 5.0f, 6.0f);
        assertEquals(4.0f, point.getX(), 0.0);
        assertEquals(5.0f, point.getY(), 0.0);
        assertEquals(6.0f, point.getZ(), 0.0);
    }

    @Test
    void getXYZ() {
        Point3D point = new Point3D(7.0f, 8.0f, 9.0f);
        float[] xyz = point.getXYZ();
        assertEquals(7.0f, xyz[0], 0.0);
        assertEquals(8.0f, xyz[1], 0.0);
        assertEquals(9.0f, xyz[2], 0.0);
    }

    @Test
    void testToString() {
        Point3D point = new Point3D(10.0f, 11.0f, 12.0f);
        assertEquals("(10.0,11.0,12.0)", point.toString());
    }
}