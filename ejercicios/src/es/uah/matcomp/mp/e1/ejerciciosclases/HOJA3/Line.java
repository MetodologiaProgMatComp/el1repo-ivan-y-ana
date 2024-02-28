package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

public class Line {
    private Point2 begin; // beginning point
    private Point2 end; // ending point

    // Constructors
    public Line (Point2 begin, Point2 end) { // caller to construct the Points
        this.begin = begin;
        this.end=end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point2(beginX, beginY); // construct the Points here
        end = new Point2(endX, endY);
    }

    // Public methods
    public String toString(){
        return "Line:["+begin+","+end+"]";
    }

    public Point2 getBegin() {
        return begin;
    }
    public Point2 getEnd() {
        return end;
    }
    public void setBegin(Point2 begin) {
        this.begin=begin;
    }
    public void setEnd(Point2 end) {
        this.end=end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int x) {
        this.begin.setX(x);
    }
    public void setBeginY(int y) {
        this.begin.setY(y);
    }
    public void setBeginXY(int x,int y) {
        this.begin.setXY(x,y);
    }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public void setEndXY(int x,int y) {
        this.end.setXY(x,y);
    }
    public int getLength() {
        int xDiff=end.getX()-begin.getX();
        int yDiff=end.getY()-begin.getY();
        return (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    } // Length of the line
    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() {
        int xDiff=end.getX()-begin.getX();
        int yDiff=end.getY()-begin.getY();
        return Math.atan2(yDiff,xDiff);
    } // Gradient in radians
    // Math.atan2(yDiff, xDiff)
}
