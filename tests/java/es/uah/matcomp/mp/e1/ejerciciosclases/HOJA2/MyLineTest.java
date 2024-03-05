package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLineTest {

    @org.junit.jupiter.api.Test
    void getBegin() {
        MyPoint p1 = new MyPoint(3, 2);
        int [] esperado = new int[2];
        esperado[0]=3;
        esperado[1]=2;
        int [] actual = p1.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void setBegin() {
        int nuevox = 4;
        int nuevoy = 7;
        MyPoint p11 = new MyPoint(2,1);
        p11.setXY(nuevox,nuevoy);
        int[] esperado= new int[] {4,7};
        int[] actual= p11.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void getEnd() {
        MyPoint p2 = new MyPoint(5, 7);
        int [] esperado = new int[2];
        esperado[0]=5;
        esperado[1]=7;
        int [] actual = p2.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void setEnd() {
        int nuevox = 7;
        int nuevoy = 8;
        MyPoint p12 = new MyPoint(5,2);
        p12.setXY(nuevox,nuevoy);
        int[] esperado= new int[] {7,8};
        int[] actual= p12.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void getBeginX() {
        MyPoint p3 = new MyPoint(3,5);
        assertEquals(3,p3.getX());
    }

    @org.junit.jupiter.api.Test
    void setBeginX() {
        int nuevox = 3;
        MyPoint p4= new MyPoint(2,3);
        p4.setX(nuevox);
        assertEquals(3,p4.getX());
    }

    @org.junit.jupiter.api.Test
    void getBeginY() {
        MyPoint p6 = new MyPoint(7,5);
        assertEquals(5,p6.getY());
    }

    @org.junit.jupiter.api.Test
    void setBeginY() {
        int nuevoy = 3;
        MyPoint p4= new MyPoint(2,3);
        p4.setX(nuevoy);
        assertEquals(3,p4.getY());
    }

    @org.junit.jupiter.api.Test
    void getEndX() {
        MyPoint p3 = new MyPoint(3,5);
        assertEquals(3,p3.getX());
    }

    @org.junit.jupiter.api.Test
    void setEndX() {
        int nuevox = 3;
        MyPoint p4= new MyPoint(2,3);
        p4.setX(nuevox);
        assertEquals(3,p4.getX());
    }

    @org.junit.jupiter.api.Test
    void getEndY() {
        MyPoint p6 = new MyPoint(7,5);
        assertEquals(5,p6.getY());
    }

    @org.junit.jupiter.api.Test
    void setEndY() {
        int nuevoy = 3;
        MyPoint p4= new MyPoint(2,3);
        p4.setX(nuevoy);
        assertEquals(3,p4.getY());
    }

    @org.junit.jupiter.api.Test
    void getBeginXY() {
        MyPoint p8 = new MyPoint(3, 2);
        int [] esperado = new int[2];
        esperado[0]=3;
        esperado[1]=2;
        int [] actual = p8.getXY();
        assertArrayEquals(esperado,actual);

    }

    @org.junit.jupiter.api.Test
    void setBeginXY() {
        int nuevox = 4;
        int nuevoy = 7;
        MyPoint p16 = new MyPoint(2,1);
        p16.setXY(nuevox,nuevoy);
        int[] esperado= new int[] {4,7};
        int[] actual= p16.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void getEndXY() {
        MyPoint p9 = new MyPoint(6, 7);
        int [] esperado = new int[2];
        esperado[0]=6;
        esperado[1]=7;
        int [] actual = p9.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void setEndXY() {
        int nuevox = 5;
        int nuevoy = 9;
        MyPoint p18 = new MyPoint(2,1);
        p18.setXY(nuevox,nuevoy);
        int[] esperado= new int[] {5,9};
        int[] actual= p18.getXY();
        assertArrayEquals(esperado,actual);
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        MyPoint start = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 5);
        MyLine line = new MyLine(start, end);
        double expectedLength = Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
        assertEquals(expectedLength, line.getLength());
    }

    @org.junit.jupiter.api.Test
    void getGradient() {
        MyPoint begin = new MyPoint(2, 3);
        MyPoint end = new MyPoint(5, 8);
        MyLine line = new MyLine(begin, end);
        int xDiff=end.getX()-begin.getX();
        int yDiff=end.getY()-begin.getY();
        double expectedGradient = Math.atan2(yDiff,xDiff);
        assertEquals(expectedGradient, line.getGradient());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MyPoint start = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 7);
        MyLine line = new MyLine(start, end);
        String expectedString = "MyLine[begin=" + start.toString() + ",end=" + end.toString() + "]";
        assertEquals(expectedString, line.toString());
    }
}