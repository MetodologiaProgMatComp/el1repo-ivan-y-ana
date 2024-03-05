package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals("Line:[Point: (1,2),Point: (3,4)]", line.toString());
    }

    @Test
    void getBegin() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(begin, line.getBegin());
    }

    @Test
    void getEnd() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(end, line.getEnd());
    }

    @Test
    void setBegin() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setBegin(new Point2(5, 6));
        assertEquals(line.setBegin(), line.getBegin());
    }

    @Test
    void setEnd() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setEnd(new Point2(7, 8));
        assertEquals(new Point2(7, 8), line.getEnd());
    }

    @Test
    void getBeginX() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        assertEquals(4, line.getEndY());
    }

    @Test
    void setBeginX() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setBeginX(5);
        assertEquals(5, line.getBeginX());
    }

    @Test
    void setBeginY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setBeginY(6);
        assertEquals(6, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setBeginXY(7, 8);
        assertEquals(7, line.getBeginX());
        assertEquals(8, line.getBeginY());
    }

    @Test
    void setEndX() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setEndX(9);
        assertEquals(9, line.getEndX());
    }

    @Test
    void setEndY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setEndY(10);
        assertEquals(10, line.getEndY());
    }

    @Test
    void setEndXY() {
        Point2 begin = new Point2(1, 2);
        Point2 end = new Point2(3, 4);
        Line line = new Line(begin, end);
        line.setEndXY(11, 12);
        assertEquals(11, line.getEndX());
        assertEquals(12, line.getEndY());
    }

    @Test
    void getLength() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(5, line.getLength());
    }

    @Test
    void getGradient() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.0001);
    }
}