package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private double radius=1;
    public MyCircle(){

    }
    public MyCircle(double x,double y,double radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center,double radius){
        this.center=center;
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public double getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(double x){
        this.center.setX(x);
    }
    public double getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(double y){
        this.center.setY(y);
    }
    public double[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(double x,double y){
        this.center.setXY(x,y);
    }
    public String toString(){
        return "MyCircle[radius="+radius+",center="+center+"]";
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
        double[] center1= this.getCenterXY();
        double[] center2= another.getCenterXY();
        return Math.sqrt(Math.pow(center1[0]-center2[0],2)+Math.pow(center1[1]-center2[1],2));
    }

}
