package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2;

public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private int radius=1;
    public MyCircle(){

    }
    public MyCircle(int x,int y,int radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(int x,int y){
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
        int[] center1= this.getCenterXY();
        int[] center2= another.getCenterXY();
        return Math.sqrt(Math.pow(center1[0]-center2[0],2)+Math.pow(center1[1]-center2[1],2));
    }

}
