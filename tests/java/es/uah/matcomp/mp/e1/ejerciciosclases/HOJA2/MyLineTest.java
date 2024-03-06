package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLineTest {
    @org.junit.jupiter.api.Test
    void MyLine(){
        MyLine line = new MyLine(0, 0, 1, 1);
        assertEquals(0,line.getBeginX());
        assertEquals(0,line.getBeginY());
        assertEquals(1,line.getEndX());
        assertEquals(1,line.getEndY());
    }
    @org.junit.jupiter.api.Test
    void getBegin() {
        MyPoint p3 = new MyPoint(3,5);
        MyLine line = new MyLine(3, 5, 7, 8);
        assertEquals(p3.getX(), line.getBegin().getX());
        assertEquals(p3.getY(), line.getBegin().getY());

    }

    @org.junit.jupiter.api.Test
    void setBegin() {
        MyLine line = new MyLine(3, 5, 7, 8);
        MyPoint p4 = new MyPoint(2,3);
        line.setBegin(p4);
        assertEquals(p4, line.getBegin());
    }

    @org.junit.jupiter.api.Test
    void getEnd() {
        MyPoint p3 = new MyPoint(7,8);
        MyLine line = new MyLine(3, 5, 7, 8);
        assertEquals(p3.getX(), line.getEnd().getX());
        assertEquals(p3.getY(), line.getEnd().getY());
    }

    @org.junit.jupiter.api.Test
    void setEnd() {
        MyLine line = new MyLine(3, 5, 7, 8);
        MyPoint p4 = new MyPoint(9,10);
        line.setEnd(p4);
        assertEquals(p4, line.getEnd());
    }

    @org.junit.jupiter.api.Test
    void getBeginX() {
        MyPoint p3 = new MyPoint(3,5);
        assertEquals(3,p3.getX());
    }

    @org.junit.jupiter.api.Test
    void setBeginX() {
        MyLine line = new MyLine(0, 5, 7, 8);
        line.setBeginX(3);
        assertEquals(3,line.getBeginX());
    }

    @org.junit.jupiter.api.Test
    void getBeginY() {
        MyPoint p6 = new MyPoint(7,5);
        assertEquals(5,p6.getY());
    }

    @org.junit.jupiter.api.Test
    void setBeginY() {
        MyLine line = new MyLine(0, 5, 7, 8);
        line.setBeginY(3);
        assertEquals(3,line.getBeginY());
    }

    @org.junit.jupiter.api.Test
    void getEndX() {
        MyPoint p3 = new MyPoint(3,5);
        assertEquals(3,p3.getX());
    }

    @org.junit.jupiter.api.Test
    void setEndX() {
        MyLine line = new MyLine(0, 5, 7, 8);
        line.setEndX(3);
        assertEquals(3,line.getEndX());
    }

    @org.junit.jupiter.api.Test
    void getEndY() {
        MyPoint p6 = new MyPoint(7,5);
        assertEquals(5,p6.getY());
    }

    @org.junit.jupiter.api.Test
    void setEndY() {
        MyLine line = new MyLine(0, 5, 7, 8);
        line.setEndY(3);
        assertEquals(3,line.getEndY());
    }

    @org.junit.jupiter.api.Test
    void getBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int[] expectedCoordinates = {1, 2};
        assertArrayEquals(expectedCoordinates, line.getBeginXY());
    }

    @org.junit.jupiter.api.Test
    void setBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int newX = 5;
        int newY = 6;
        line.setBeginXY(newX, newY);
        assertEquals(newX, line.getBeginX());
        assertEquals(newY, line.getBeginY());
    }

    @org.junit.jupiter.api.Test
    void getEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int[] expectedCoordinates = {3, 4};
        assertArrayEquals(expectedCoordinates, line.getEndXY());
    }

    @org.junit.jupiter.api.Test
    void setEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);
        int newX = 5;
        int newY = 6;
        line.setEndXY(newX, newY);
        assertEquals(newX, line.getEndX());
        assertEquals(newY, line.getEndY());
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