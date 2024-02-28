package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

public class Point2 {
    private int x; // x co-ordinate
    private int y; // y co-ordinate
    // Constructor
    public Point2 (int x, int y) {
        this.x=x;
        this.y=y;
    }

    // Public methods
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public void setXY(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
