package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(1, 2, 4, 5, 7, 1);
        assertEquals("MyTriangle[v1=(1,2),v2=(4,5),v3=(7,1)]", triangle.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 2, 0, 1, 3);
        assertEquals(8.32455, equilateralTriangle.getPerimeter(), 0.001);

        MyTriangle isoscelesTriangle = new MyTriangle(-1, -1, 1, 5, 3, -1);
        assertEquals(16.6491, isoscelesTriangle.getPerimeter(), 0.001);

        MyTriangle scaleneTriangle = new MyTriangle(0, 0, 0, 2, 3, 0);
        assertEquals(8.605, scaleneTriangle.getPerimeter(), 0.001);
    }

    @Test
    void getType() {
        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 2, 0, 1, (int) Math.sqrt(3));
        assertEquals("Isosceles", isoscelesTriangle.getType());

        MyTriangle isoscelesTriangle2 = new MyTriangle(0, 0, 0, 2, 3, 0);
        assertEquals("Scalene", isoscelesTriangle2.getType());

        MyTriangle scaleneTriangle = new MyTriangle(1, 2, 4, 5, 7, 1);
        assertEquals("Scalene", scaleneTriangle.getType());
    }
}