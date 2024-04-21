package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(double x1,double y1,double x2,double y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }
    public MyLine(MyPoint begin,MyPoint end){
        this.begin=begin;
        this.end=end;
    }
    public MyPoint getBegin(){
        return this.begin;
    }
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public MyPoint getEnd(){
        return this.end;
    }
    public void setEnd(MyPoint end){
        this.end=end;
    }
    public double getBeginX(){
        return this.begin.getX();
    }
    public void setBeginX(double x){
        this.begin.setX(x);
    }
    public double getBeginY(){
        return this.begin.getY();
    }
    public void setBeginY(double y){
        this.begin.setY(y);
    }
    public double getEndX(){
        return this.end.getX();
    }
    public void setEndX(double x){
        this.end.setX(x);
    }
    public double getEndY(){
        return this.end.getY();
    }
    public void setEndY(double y){
        this.end.setY(y);
    }
    public double[] getBeginXY(){
        return this.begin.getXY();
    }
    public void setBeginXY(double x,double y){
        this.begin.setXY(x,y);
    }
    public double[] getEndXY(){
        return this.end.getXY();
    }
    public void setEndXY(double x,double y){
        this.end.setXY(x,y);
    }
    public double getLength(){
        return this.begin.distance(end);
    }
    public double getGradient(){
        double xDiff=end.getX()-begin.getX();
        double yDiff=end.getY()-begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLine[begin="+begin.toString()+",end="+end.toString()+"]";
    }
}
