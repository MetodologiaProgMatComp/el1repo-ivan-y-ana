package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint v1 = new MyPoint(1, 1);
        MyPoint v2 = new MyPoint(2, 2);
        MyPoint v3 = new MyPoint(3, 3);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);
        assertEquals("MyTriangle[v1=(1,1),v2=(2,2),v3=(3,3)]", triangle.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 3, 0, 0, 4);
        assertEquals(12.0, equilateralTriangle.getPerimeter(), 0.001);

        MyTriangle isoscelesTriangle = new MyTriangle(-1, -1, 1, 5, 3, -1);
        assertEquals(16.6491, isoscelesTriangle.getPerimeter(), 0.001);

        MyTriangle scaleneTriangle = new MyTriangle(0, 0, 0, 2, 3, 0);
        assertEquals(8.605, scaleneTriangle.getPerimeter(), 0.001);
    }

    @Test
    void getType() {
        MyTriangle isoscelesTriangle = new MyTriangle(-1, -1, 1, 5, 3, -1);
        assertEquals("Isosceles", isoscelesTriangle.getType());

        MyTriangle isoscelesTriangle2 = new MyTriangle(0, 0, 0, 2, 3, 0);
        assertEquals("Scalene", isoscelesTriangle2.getType());

        MyTriangle scaleneTriangle = new MyTriangle(1, 2, 4, 5, 7, 1);
        assertEquals("Scalene", scaleneTriangle.getType());
    }
}