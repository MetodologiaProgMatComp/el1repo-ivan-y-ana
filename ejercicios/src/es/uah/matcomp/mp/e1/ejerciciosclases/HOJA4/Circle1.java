package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class Circle1 extends Shape {
    protected double radius = 1.0;

    //Constructores
    public Circle1(){
        super();
    }
    public Circle1(double radius){
        this.radius = radius;
    }
    public Circle1(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
